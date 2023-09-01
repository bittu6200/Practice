var arr=Array(1,9,2,4,5,6,7)
var arr1=Array(1,9,2,4,5,6,7)
arr=arr.sorted
arr
val n=arr.length-1
def kthElement(k:Int): Int = {

  if(n<k) return -1
 else {
    arr(k-1)
  }

}
kthElement(2)
for(i<-0 until  n){
  if(arr1(i)==kthElement(2)){
    println(i)
  }

}