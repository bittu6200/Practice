//import java.util._
//// Java program for inorder traversals
//
//
//// Structure of a Binary Tree Node
//class Node(var data: Int) {
// // left = right = null
//  var left: Node = null
//  var right: Node = null
//}
//
//// Main class
////object GFG {
//  // Function to print inorder traversal
//  def printInorder(node: Node): Unit = {
//    if (node == null) return
//    // First recur on left subtree
//    printInorder(node.left)
//    // Now deal with the node
//    System.out.print(node.data + " ")
//    // Then recur on right subtree
//    printInorder(node.right)
//  }
//
//  // Driver code
//  def main(args: Array[String]): Unit = {
//    val root = new Node(1)
//    root.left = new Node(2)
//    root.right = new Node(3)
//    root.left.left = new Node(4)
//    root.left.right = new Node(5)
//    root.right.right = new Node(6)
//    // Function call
//    System.out.println("Inorder traversal of binary tree is: ")
//    printInorder(root)
// // }
//}
//// This code is contributed by prasad264
