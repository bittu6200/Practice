trait vechile{
  def printf:String
}
class TwoWheeler extends vechile
{
  override def printf: String = "twoWheeler"
}
class fourWheeler extends vechile{
  override def printf: String = "four wheeler"
}
def twoOrFourWheeler[T](vachile:vechile):Unit={
  vachile match {
    case wheeler: TwoWheeler=>wheeler.printf
    case wheeler: fourWheeler=>wheeler.printf
    case _: TwoWheeler => print("not supported")
  }


}
println(twoOrFourWheeler(new TwoWheeler))

////////////////////