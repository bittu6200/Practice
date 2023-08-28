package DSA.Tree

//binary tree

class TreeNode1(var value:Int, var left:TreeNode1=null, var right:TreeNode1=null)

class Binarysearchtrees1{
 var rootNode:TreeNode1=null

 def insertmethod(value:Int): Unit = {
  rootNode=inserRec(rootNode,value)
  println(rootNode.value)
 }
 def inserRec(rootNode: TreeNode1, value: Int): TreeNode1 = {
  if(rootNode==null){
   new TreeNode1(value)
  }else {
   if(value<rootNode.value){
    rootNode.left=inserRec(rootNode,value)
   }
   else if(value>rootNode.value){
    rootNode.right=inserRec(rootNode, value)
   }
  }
  rootNode
 }

 def search(value:Int): Boolean = {
  searchRec(rootNode,value)
 }
 def searchRec(node: TreeNode1, value: Int): Boolean = {
  if(node==null){
   return false
  }
  else if(node.value==value){
   return true
  }
  else if(value<node.value){
   searchRec(node.left,value)
  }else{
   searchRec(node.right,value)
  }
 }

}
object Tree extends App{
 val p=new BinarySearchTree
 println(p.insert(3))
 println(p.insert(8))
 println(p.insert(12))
 println(p.search(12))
 println(p.search(1))

}
