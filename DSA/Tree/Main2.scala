//package DSA.Tree
//
////object Main2 {
////
////}
////Binary Tree
//
////    0
////  0   0
////0       0
//
//
////FULL TREEE  0 HO YA 2 CHILD
//
////Complete binary tree   // 0 ya 2 hioni cahihiye lekin left wala noide at most 1
//
////perfect binary tree
////2^h - 1 node
////tree traversal
////1.inorder (left , root, rioght
////2.preorder(root,left , right
////3.postOrder(left,right,root)
//
//class Node(var value:Int,var left:Node=null,var right:Node=null)
//
//
//class BinaryTree1 {
//
//  var rootNode: Node = null
//
//  def insertValue(value: Int): Unit = {
//
//    rootNode = insertRec(rootNode,value)
//  }
//  def insertRec(rootNode: Node, value: Int): Node = {
//    if(rootNode==null){
//      new Node(value)
//    }else{
//      if(value<rootNode.value)
//      {
//        rootNode.left=insertRec(rootNode, value)
//      }
//      else if(value>rootNode.value){
//        rootNode.right=insertRec(rootNode, value)
//      }
//
//
//    }
//    rootNode
//  }
//
//
//
//  def search(value:Int):Boolean={
//    searchRec(rootNode,value)
//  }
//  /*
//  private def searchRec(rootNode: TreeNode, value: Int): Boolean = {
//    if (rootNode == null) {
//      false
//    } else if (value == rootNode.value) {
//      true
//    } else if (value < rootNode.value) {
//      searchRec(rootNode.left, value)
//    } else {
//      searchRec(rootNode.right, value)
//    }
//  }
//   */
//  def searchRec(root: Node, value: Int) : Boolean={
//    if(root == null){ false }
//    else if(value ==root.value) {true }
//    else if (value<root.value){
//      searchRec(root.left, value)
//    }
//    else  {
//      searchRec(root.right, value)
//    }
//
//  }
//
//}
//object Main2 extends App{
//val p=new BinaryTree1()
//
//p.insertValue(15)
//p.insertValue(10)
//p.insertValue(13)
//p.insertValue(11)
//p.insertValue(12)
//
//println(p.search(15))
//
//}
//
