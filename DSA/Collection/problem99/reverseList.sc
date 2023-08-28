// P05 (*) Reverse a list.
//     Example:
//     scala> reverse(List(1, 1, 2, 3, 5, 8))
val ls= List(8, 5, 3, 2, 1, 1)
ls.reverse
ls.foldLeft(List[Int]()){(r,h)=>h::r}  // r= list() , h=8 => 8::list(), r=list(8),h=5=>5::list(8),
//r=list(5,8),h=3,r(5,8) ,3::list(5,8)........................

object P05 {
  // Builtin.
  def reverseBuiltin[A](ls: List[A]): List[A] = ls.reverse

  // Simple recursive.  O(n^2)
  def reverseRecursive[A](ls: List[A]): List[A] = ls match {
    case Nil       => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }

  // Tail recursive.
  def reverseTailRecursive[A](ls: List[A]): List[A] = {
    def reverseR(result: List[A], curList: List[A]): List[A] = curList match {
      case Nil       => result
      case h :: tail => reverseR(h :: result, tail)
    }
    reverseR(Nil, ls)
  }

  // Pure functional
  def reverseFunctional[A](ls: List[A]): List[A] =
    ls.foldLeft(List[A]()) { (r, h) => h :: r }
}

def rev[A](ls:List[A]):List[A]={
  def helper[A](ls:List[A],res:List[A]):List[A]=ls match {
    case Nil=>res
    case head::tail=>helper(tail,head::res)
  }
  helper(ls,Nil)
}