// P07 (**) Flatten a nested list structure.
//     Example:
//     scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//     res0: List[Any] = List(1, 1, 2, 3, 5, 8)


  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }
flatten(List(List(1, 1), 2, List(3, List(5, 8))))


def combine(ls:List[Any]):List[Any]=ls flatMap{
  case ms:List[_]=>flatten(ms)
  case e=>List(e)
}
combine(List(List(1, 1), 2, List(3, List(5, 8))))

val p=List(List(1, 1), 2, List(3, List(5, 8)))

def flat(ls:List[Any]):List[Any]= ls flatMap {
  case ms:List[_]=>flat(ms)
  case w=>List(w)

}

