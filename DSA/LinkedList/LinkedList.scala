class Node(var data: Int,var next:Node = null)

 //LinkedList()



class LinkedList {

  var head: Node = null

  def insert(list:LinkedList,data :Int): Unit = {
    val new_node=new Node(data)         // 4
    if(list.head==null) list.head=new_node  // ->list.head.next=>list.head.next.next
    else{
      var last=list.head
        while(last.next !=null) {
          last=last.next
        }
      last.next=new_node
    }
  }

  // Method to insert a new node
//  def insert(list: LinkedList, data: Int) = {
//    // Create a new node with given data
//    val new_node = new Node(data)
//    // If the Linked List is empty,
//    // then make the new node as head
//    if (list.head == null) list.head = new_node   //4 -next
//    else {                                        //5
//      // Else traverse till the last node
//      // and insert the new_node there
//      var last = list.head
//      while (last.next != null) last = last.next
//      // Insert the new_node at last node
//      last.next = new_node
//    }
//    // Return the list by head
//    list
//  }

  // Method to print the LinkedList.
  def printList(list: LinkedList): Unit = {
    var currNode = list.head    //4->5->7
    System.out.print("LinkedList: ")
    // Traverse through the LinkedList
    while (currNode != null) {
      // Print the data at current node
      System.out.print(currNode.data + " ")
      // Go to next node
      currNode = currNode.next
    }
  }
}

  object LinkedList extends App {
    // Driver code

      /* Start with the empty list. */
      var list = new LinkedList
      //
      // ******INSERTION******
      //
      // Insert the values
      list.insert(list, 1)
    list.insert(list, 2)
    list.insert(list, 3)
    list.insert(list, 4)
    list.insert(list, 5)
    list.insert(list, 6)

      // Print the LinkedList
      list.printList(list)
    }




