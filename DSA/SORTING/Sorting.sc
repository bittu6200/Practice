object SelectionSort {
  def selectionSort(arr: Array[Int]): Unit = {
    val n = arr.length

    for (i <- 0 until n - 1) {
      var minIndex = i

      for (j <- i + 1 until n) {
        if (arr(j) < arr(minIndex)) {
          minIndex = j
        }
      }

      if (minIndex != i) {
        val temp = arr(i)
        arr(i) = arr(minIndex)
        arr(minIndex) = temp
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(64, 25, 12, 22, 11)
    println("Original array: " + arr.mkString(", "))

    selectionSort(arr)

    println("Sorted array: " + arr.mkString(", "))
  }
}
