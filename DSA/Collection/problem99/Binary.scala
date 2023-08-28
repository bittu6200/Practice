package DSA.Collection.problem99



object Binary extends App{



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
}
// Java implementation of recursive Binary Search

// Java implementation of recursive Binary Search
//object Binary extends App{ // Driver code
//
//  def binarySearch(arr: Array[Int], l: Int, r: Int, x: Int): Unit = {
//    if (r >= l) {
//      val mid = (r + l) / 2
//
//      if (arr(mid) == x) print(mid)
//
//      if (arr(mid) > x) return binarySearch(arr, l, mid - 1, x)
//      binarySearch(arr, mid + 1, r, x)
//    }
//
//  }
//
//    val arr = Array(2, 3, 4, 10, 40)
//    val n = arr.length
//    val x = 10
//   print(binarySearch(arr, 0, n - 1, x))
//
//
//}





