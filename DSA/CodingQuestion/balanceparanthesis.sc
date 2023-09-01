import scala.collection.mutable
/*
def balancePar(Str:String): Boolean = {
  var stack=new mutable.Stack[Char]()

  for(char<-stack){
    if(char=='(' || char=='{' || char=='['){
      stack.push(char)
    }
    else if (char==')' || char=='}' || char==']'){
      if(stack.isEmpty){
        return false
      }
      val top=stack.pop()
      if ((top=='(' && char!=')') || (top=='{' && char!='}')||(top=='[' && char!=']')  ){
        return false
      }
    }
  }
  stack.isEmpty
}
balancePar("((){")
*/

//object BalancedParentheses {
  def isBalanced(str: String): Boolean = {
    val stack = mutable.Stack[Char]()

    for (char <- str) {
      if (char == '(' || char == '{' || char == '[') {
        stack.push(char)
      } else if (char == ')' || char == '}' || char == ']') {
        if (stack.isEmpty) {
          return false
        }

        val top = stack.pop()
        if ((top == '(' && char != ')') || (top == '{' && char != '}') || (top == '[' && char != ']')) {
          return false
        }
      }
    }

    stack.isEmpty
  }

 // def main(args: Array[String]): Unit = {
    val balancedStr = "({[])"
    val unbalancedStr = "({[})"

    println(s"Is '$balancedStr' balanced? ${isBalanced(balancedStr)}") // Output: Is '({[]})' balanced? true
    println(s"Is '$unbalancedStr' balanced? ${isBalanced(unbalancedStr)}") // Output: Is '({[})' balanced? false
  //}
//}

