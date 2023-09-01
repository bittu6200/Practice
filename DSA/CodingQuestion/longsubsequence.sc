import scala.collection.mutable
//write a method that takes string as input and returns length of longest non repeating substring.

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
      start=charIndexmap(input(end))+1                // 0+1=1//                start=4
    }
    charIndexmap(input(end))=end   //charIndex(a,0),charIndex(b,1)//charIndex(c,2)// charIndexmap(a,3),charIndexmap(b,4)//charIndexmap(c,5)//charIndexmap(d,6)//charIndexmap(b,7)
    maxLength=maxLength.max(end-start+1) //(0-0+1)->1//(1-0+1)->2 //(2-0+1)-> 3 //(3-1+1)-> 3//(4-2+1)-> 3//(5-3+1)->3//(6-3+1)=>4//(7-5+1)=3
  }
  maxLength
}

val input="abcabcdbb"
val p=longestNonReaptingsubstring(input)
println(s"the length of longest non repeating substring is $p")
/*

Sure, here's a breakdown of the algorithm in a more dry-run format:

Input: "abcabcbb"

Initialize maxLength to 0, start to 0, and an empty charIndexMap.

Loop through each character in the input string:

At index 0 (character 'a'):
charIndexMap is empty, so add ('a', 0) to the map.
Update maxLength to 1.
At index 1 (character 'b'):
charIndexMap doesn't contain 'b', so add ('b', 1) to the map.
Update maxLength to 2.
At index 2 (character 'c'):
charIndexMap doesn't contain 'c', so add ('c', 2) to the map.
Update maxLength to 3.
At index 3 (character 'a'):
'a' is already in charIndexMap, and its index (0) is greater than or equal to start (0).
Update start to 1.
At index 4 (character 'b'):
'b' is already in charIndexMap, but its index (1) is greater than start (1).
Update maxLength to 3.
At index 5 (character 'c'):
'c' is already in charIndexMap, but its index (2) is greater than start (1).
Update maxLength to 3.
At index 6 (character 'b'):
'b' is already in charIndexMap, but its index (1) is greater than start (1).
Update start to 2.
At index 7 (character 'b'):
'b' is already in charIndexMap, but its index (7) is greater than start (2).
Update start to 3.
The loop ends, and the final maxLength is 3, which is the length of the longest non-repeating substring "abc".
 */