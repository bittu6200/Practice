package DSA.Tree


class TreeNode(var value: Int, var left: TreeNode1 = null, var right: TreeNode1 = null)

class BinarySearchTree {
  private var root: TreeNode1 = null

  def insert(value: Int): Unit = {
    root = insertRec(root, value)
  }

  private def insertRec(rootNode: TreeNode1, value: Int): TreeNode1 = {
    if (rootNode == null) {
      new TreeNode1(value)
    } else {
      if (value < rootNode.value) {
        rootNode.left = insertRec(rootNode.left, value)
      } else if (value > rootNode.value) {
        rootNode.right = insertRec(rootNode.right, value)
      }
      rootNode
    }
  }

  def search(value: Int): Boolean = {
    searchRec(root, value)
  }

  private def searchRec(rootNode: TreeNode1, value: Int): Boolean = {
    if (rootNode == null) {
      false
    } else if (value == rootNode.value) {
      true
    } else if (value < rootNode.value) {
      searchRec(rootNode.left, value)
    } else {
      searchRec(rootNode.right, value)
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val bst = new BinarySearchTree()
    bst.insert(5)
    bst.insert(3)
    bst.insert(7)
    bst.insert(1)
    bst.insert(4)

    println(bst.search(4))  // Output: true
    println(bst.search(6))  // Output: false
  }
}
