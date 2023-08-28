import scala.collection.mutable
import scala.io.Source

// Define the adjacency list using a Map
  var adjacencyList: mutable.Map[Int, List[Int]] = mutable.Map(
    1 -> List(2, 3),
    2 -> List(1, 3, 4),
    3 -> List(1, 2, 4),
    4 -> List(2, 3)
  )

var map=mutable.Map(1->2)


 adjacencyList+=(10->List(2,4))

//getOrElseUpdate ye value dega
map.update(1,4+1)
map.get(1)



  def addEdge(source: Int,des:Int): Unit = {
    adjacencyList.getOrElseUpdate(source,List()) match {
      case list: List[Int]=> adjacencyList.update(source,des :: list)
    }
  }



  // Print the adjacency list
  for ((vertex, neighbors) <- adjacencyList) {
    println(s"Vertex $vertex is connected to: ${neighbors.mkString(", ")}")
  }
val list=List(1,2,3,4,5)
  list.mkString("-")
