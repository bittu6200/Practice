import scala.language.implicitConversions

// Define an implicit method to convert Int to String
implicit def intToString(i: Char): Int = i.toInt

  // Import the implicit method

val to:Char='A'
  val num: Int = to

  //val str: String = num  // The implicit method is used to convert Int to String

  println("Converted string: " + num)

