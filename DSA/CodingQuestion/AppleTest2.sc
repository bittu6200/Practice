import scala.collection.mutable

/*
1.write a method that takes string as input and returns length of longest non repeating substring.
2.find then count of valid parenthesis.
3.check valid parenthesis
4.check the valid palindrome or not.
5.check the valid palindrome or not then make them palindrome after removing 1 or 2 characters.
6.EvenOdd pair.
7.find the kth element.
8.count the pairsum.

 */

//-------------------------------------------------------------------------------------------------------
//1.write a method that takes string as input and returns length of longest non repeating substring.

def longestNonReaptingsubstring(input: String):Int={
  //abcabcdb
  //01234567
  var maxLength=0
  var start=0
  val charIndexmap=mutable.Map[Char,Int]()
  for(end<-0 until input.length){   //8
    if(charIndexmap.contains(input(end)) && charIndexmap(input(end))>=start){   //at index=3 true && charIndexmap(input(3)) =>charIndexmap(a)=0>=0 // start=0+1=1
                                                                                // at index=4 true && charIndexmap(input(4)) =>charIndexmap(b)=1>=1 //start=1+1=2
                                                                                // at index=5 true && charIndexmap(input(5)) =>charIndexmap(c)=2>=2 //start=2+1=3
                                                                                //at index=7 true &&   charIndexmap(input(7))=>charIndexmap(b)=4>=2 //start=4+1=5
      start=charIndexmap(input(end))+1                  // 0+1=1//                start=4
    }
    charIndexmap(input(end))=end   //charIndex(a,0),charIndex(b,1)//charIndex(c,2)// charIndexmap(a,3),charIndexmap(b,4)//charIndexmap(c,5)//charIndexmap(d,6)//charIndexmap(b,7)
    maxLength=maxLength.max(end-start+1) //(0-0+1)->1//(1-0+1)->2 //(2-0+1)-> 3 //(3-1+1)-> 3//(4-2+1)-> 3//(5-3+1)->3//(6-3+1)=>4//(7-5+1)=3
  }
  maxLength
}

val input="abcabcdbb"
val p=longestNonReaptingsubstring(input)
println(s"the length of longest non repeating substring is $p")

//O(n)

//2.find then count of valid parenthesis

//(()()(()

def validparenthNumber(s:String):Int={
  val stack=new mutable.Stack[Char]()
  var count=0
  for(char<-s){
    if(char=='('){
      stack.push(char)
    }else if(char==')' && stack.nonEmpty && stack.top=='('){
      stack.pop()
      count+=1

    }
  }
  count
}
val input="(()()(()"
val p=validparenthNumber(input)
println(s"$p")

//3.check valid parenthesis

def isBalanced(str: String): Boolean = {
  val stack = mutable.Stack[Char]()

  for (char <- str) {
    if (char == '(' || char == '{' || char == '[') {
      stack.push(char)
    } else if (char == ')' || char == '}' || char == ']') {
      if (stack.isEmpty) {
        return false
      }

      val top = stack.pop()
      if ((top == '(' && char != ')') || (top == '{' && char != '}') || (top == '[' && char != ']')) {
        return false
      }
    }
  }

  stack.isEmpty
}

// def main(args: Array[String]): Unit = {
val balancedStr = "({[])"
val unbalancedStr = "({[})"

println(s"Is '$balancedStr' balanced? ${isBalanced(balancedStr)}") // Output: Is '({[]})' balanced? true
println(s"Is '$unbalancedStr' balanced? ${isBalanced(unbalancedStr)}") // Output: Is '({[})' balanced? false

//4.check the valid palindrome or not
val str:String="bittib"
def palindrome(srt:String):Boolean={
  srt==str.reverse
}

//5.check the valid palindrome or not then make them palindrome after removing 1 or 2 characters

def isPalindrome(srt:String): Boolean = {
  srt==srt.reverse
}

def toMakePlindrome(str: String): String = {
  if(isPalindrome(str)){
    str
  }else {
    def canbepallindrome(substr: String): Boolean = {
      substr == substr.reverse
    }

    for (i <- 0 until str.length) {
      val substr = str.patch(i, "", 1)
      if (canbepallindrome(substr)) {
        return substr
      }
    }
    for (i <- 0 until str.length - 1) {
      val substr = str.patch(i, "", 2)
      if (canbepallindrome(substr)) {
        return substr
      }
    }
  }
  "Not possible"
}

isPalindrome("bittib")
toMakePlindrome("bittibbb")

//6.EvenOdd pair

val n=7
val (even,odd)=(1 to n).partition(_ %2 == 0)


even
odd

def evenOddPair(value:Int):(Int,Int)={
  if(value %2==0){
    (value,value+1)
  }else{
    (value-1,value)
  }
}
var value=7
while(value>0) {
  evenOddPair(value)
  value=value-1;
}

//7.find the kth element

def binarySeraf(p:Array[Int],K:Int,h:Int,l:Int): Int = {
  while(l<h){
    val mid = (l + h) / 2
    if(p(mid)==K) print(mid)
    if (p(mid)<K) return binarySeraf(p, K,h, mid+1)
    binarySeraf(p,K,mid-1,l)
  }
  -1
}

val Arr = Array(2, 3, 4, 10, 40)
val K = 7
val l = 0
var h = Arr.length - 1
print(binarySeraf(Arr,K,h,0))

//8.count the pairsum
def countPairsWithSum(arr: Array[Int], targetSum: Int): Int = {
  var count = 0
  val arr1 = mutable.HashSet.empty[Int]

  for (num <- arr) {
    val complement = targetSum - num
    if (arr.contains(complement)) {
      count += 1
    }
    arr1.add(num)

  }

  count
}

//1,2,3,4,5
//
// c={5-1}=2  , c=1  , count=0
//c=(5-2}=3  ,c=1,2  , count=0
//c={5-3}=2  c=1,2,3 , count=1

// Example usage:
val arr = Array(1, 2, 3, 4, 5, 6)
val targetSum = 7
val result = countPairsWithSum(arr, targetSum)
println(s"Number of pairs with sum $targetSum: $result")
