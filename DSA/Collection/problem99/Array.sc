//crud
//create
//read
//updatre
//delete
//

val a=Array(10,2,3,4)
val a2=Array(1,2,3,4)
a :+ 2
a++a2
2 +: a2
a++a2

//////////////////////////////////////////////
//
val Arr=Array(3,5,7,9,89,2,34)
// arr(mid)=9 k=6
//2=f,3,5,7,9,34,45,89=h

val key=7
def bs( arr:Array[Int],key:Int): Unit = {
  val arr1=Arr.sorted
  var h=arr.length-1
  var f=0
  while(f<=h) {
    var mid = (h + f) / 2
    if(arr1(mid)==key) {mid}
    if(arr1(mid)>key)
      h=mid -1
    else if (arr1(mid)<key){
      f=mid+1
    }
  }
}
bs(Arr,key)
