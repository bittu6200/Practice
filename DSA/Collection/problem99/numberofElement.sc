// P04 (*) Find the number of elements of a list.
//     Example:
//     scala> length(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 6

object P04 {
  // Builtins.
  def lengthBuiltin[A](ls: List[A]): Int = ls.length

  // Simple recursive solution.
  def lengthRecursive[A](ls: List[A]): Int = ls match {
    case Nil       => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }

  // Tail recursive solution.  Theoretically more efficient; with tail-call
  // elimination in the compiler, this would run in constant space.
  // Unfortunately, the JVM doesn't do tail-call elimination in the general
  // case.  Scala *will* do it if the method is either final or is a local
  // function.  In this case, `lengthR` is a local function, so it should
  // be properly optimized.
  // For more information, see
  // http://blog.richdougherty.com/2009/04/tail-calls-tailrec-and-trampolines.html
  def lengthTailRecursive[A](ls: List[A]): Int = {
    def lengthR(result: Int, curList: List[A]): Int = curList match {
      case Nil       => result
      case _ :: tail => lengthR(result + 1, tail)
    }
    lengthR(0, ls)
  }

  // More pure functional solution, with folds.
  def lengthFunctional[A](ls: List[A]): Int = ls.foldLeft(0) { (c, _) => c + 1 }
}

def tailtrec[A](ls:List[A]):Int= {
  def len[A](rs: Int, ls: List[A]): Int = ls match {
    case Nil => rs
    case _::tail=>len(rs+1,tail)
  }
  len(0,ls)
}

val p=List(1,2,3,4,5,6)
p.foldLeft(0){(c,_)=>c+1}

