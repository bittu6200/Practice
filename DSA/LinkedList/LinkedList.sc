import java.io._


// Java program to implement
// a Singly Linked List
object LinkedList { // Linked list Node.
  // This inner class is made static
  // so that main() can access it
  class Node(var data: Int) // Constructor
  {
    next = null
    var next: LinkedList.Node = null
  }

  // Method to insert a new node
  def insert(list: LinkedList, data: Int) = {
    // Create a new node with given data
    val new_node = new LinkedList.Node(data)
    // If the Linked List is empty,
    // then make the new node as head
    if (list.head == null) list.head = new_node
    else {
      // Else traverse till the last node
      // and insert the new_node there
      var last = list.head
      while (last.next != null) last = last.next
      // Insert the new_node at last node
      last.next = new_node
    }
    // Return the list by head
    list
  }

  // Method to print the LinkedList.
  def printList(list: LinkedList): Unit = {
    var currNode = list.head
    System.out.print("LinkedList: ")
    // Traverse through the LinkedList
    while (currNode != null) {
      // Print the data at current node
      System.out.print(currNode.data + " ")
      // Go to next node
      currNode = currNode.next
    }
  }

  // Driver code
  def main(args: Array[String]): Unit = {
    /* Start with the empty list. */
    var list = new LinkedList
    //
    // ******INSERTION******
    //
    // Insert the values
    list = insert(list, 1)
    list = insert(list, 2)
    list = insert(list, 3)
    list = insert(list, 4)
    list = insert(list, 5)
    list = insert(list, 6)
    list = insert(list, 7)
    list = insert(list, 8)
    // Print the LinkedList
    printList(list)
  }
}

class LinkedList {
  var head: LinkedList.Node = null // head of list

}
