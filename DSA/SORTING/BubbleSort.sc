import java.io._
// Optimized java implementation of Bubble sort


object GFG {
  def main(args: Array[String]): Unit = {
    val arr = Array(64, 34, 25, 12, 22, 11, 90)
    val n = arr.length
    bubbleSort(arr, n)
    System.out.println("Sorted array: ")
    printArray(arr, n)
  }
}


