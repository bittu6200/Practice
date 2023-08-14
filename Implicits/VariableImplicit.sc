object Main {

  def main(args: Array[String]) {
    val message = "hello "
    implicit val name = "world!"

    def disp(implicit nm: String) = message + nm

    // Implicit parameter will be passed here
    val result = disp

    // Implicit parameters will not be passed
    val result2 = disp("Bittu!")
    println("With Implicit parameters:")
    println(result)
    println("Without Implicit parameters:")
    println(result2)
  }
}
