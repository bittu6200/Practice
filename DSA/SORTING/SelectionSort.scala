object select extends App{
  val a=Array(9,5,3,5,1)
  //n=5 index =4

  def sectionsort(a: Array[Int]):Unit= {
    val n = a.length;
    for (i <- 0 until n-1 ) {
      var smallIndex = i
      for (j <- i + 1 until n ) {
        if (a(j) < a(smallIndex)) {
          smallIndex = j
        }

      }
      if (i != smallIndex) {
        var temp = a(smallIndex)
        a(smallIndex) = a(i)
        a(i) = temp
      }

    }
    println(a.foreach(p=>print(p+" ")))
  }

  println(sectionsort(a))
}