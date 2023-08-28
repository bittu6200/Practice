package DSA.GRAPH


import scala.collection.mutable

class Graph {
  private val adjacencyList: mutable.Map[Int, mutable.Set[Int]] = mutable.Map()

  def addVertex(vertex: Int): Unit = {
    if (!adjacencyList.contains(vertex)) {
      adjacencyList(vertex) = mutable.Set()
    }
  }



  def addEdge(vertex1: Int, vertex2: Int): Unit = {
    addVertex(vertex1)
    addVertex(vertex2)
    adjacencyList(vertex1) += vertex2
    adjacencyList(vertex2) += vertex1

  }

  def getVertices: Iterable[Int] = adjacencyList.keys

  def getNeighbors(vertex: Int): Iterable[Int] = {
    adjacencyList.getOrElse(vertex, mutable.Set())
  }

  override def toString: String = {
    adjacencyList.map { case (vertex, neighbors) =>
      s"$vertex -> ${neighbors.mkString(", ")}"
    }.mkString("\n")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val graph = new Graph()

    graph.addEdge(1, 2)
    graph.addEdge(1, 3)
    graph.addEdge(2, 3)
    graph.addEdge(2, 4)
    graph.addEdge(3, 4)

    println("Vertices:")
    graph.getVertices.foreach(println)

    println("\nNeighbors:")
    graph.getVertices.foreach { vertex =>
      println(s"$vertex -> ${graph.getNeighbors(vertex).mkString(", ")}")
    }

    println("\nGraph:")
    println(graph)
  }
}
