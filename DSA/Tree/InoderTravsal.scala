package DSA.Tree


import java.util._

class Node(var data: Int,var left:Node=null,var right: Node=null)




object InoderTravsal {

def printInorder(node: Node): Unit = {
  if (node == null) return

  printInorder(node.left)

  System.out.print(node.data + " ")

  printInorder(node.right)
}

  def printPost(node:Node): Unit = {
    if(node==null) return
    printPost(node.left)
    printPost(node.right)
    System.out.print(node.data + " ")
  }

  def printPre(node: Node): Unit = {
    if (node == null) return
    System.out.print(node.data + " ")
    printPost(node.left)
    printPost(node.right)

  }

//    1
//  2   3
//4   5   6
def main(args: Array[String]): Unit = {
  val root = new Node(1)
  root.left = new Node(2)
  root.right = new Node(3)
  root.left.left = new Node(4)
  root.left.right = new Node(5)
  root.right.right = new Node(6)

  System.out.println("Inorder traversal of binary tree is: ")
  printInorder(root)
  println()

  System.out.println("post traversal of binary tree is: ")
  printPost(root)
  println()

  System.out.println("pre traversal of binary tree is: ")
  printPre(root)
  println()
   }
}
// This code is contributed by prasad264
