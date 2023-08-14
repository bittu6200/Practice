implicit val tax=10
def calTax(price:Double)(implicit tax:Int):Double={
  price+tax
}
calTax(2)