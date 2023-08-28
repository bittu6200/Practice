package DSA.GRAPH

import sun.security.provider.certpath.Vertex

import scala.annotation.unused
import scala.collection.{Iterable, mutable}
import scala.collection.mutable._

//object MainGraph {

//}

class Graph1{

  var adjacencyList:mutable.Map[Int,mutable.Set[Int]]=mutable.Map();
  //mutable.Map[String, Int]()
 // 1-{1,2},{2,3}
  def addVertex(vertex: Int): Unit = {
   if(!adjacencyList.contains(vertex)){
     adjacencyList(vertex)=mutable.Set()
   }
 }
 // A(srce)-------------------B(dest)
  def addEdge(vertex1:Int,vertex2:Int): Unit = {
   addVertex(vertex1)
    addVertex(vertex2)
    adjacencyList(vertex1)+=vertex2
    adjacencyList(vertex2)+=vertex1
  }

//  def addEdgep(vertex1:Int,vertex2:Int): Unit = {
//  adjacencyList.getOrElseUpdate(vertex1,Set()) match {
//    case list: Set[Int]=> adjacencyList.update(vertex1,Set()+=vertex2)
//  }
//}

  def getVertex : Iterable[Int]=adjacencyList.keys

  def neighbour(vertex: Int):Iterable[Int]={
    adjacencyList.getOrElse(vertex,mutable.Set())
  }



}
object MainGraph extends App {
  val g = new Graph1
  g.addVertex(1)
  g.addVertex(2)
  g.addVertex(6)

  g.addEdge(1, 2)
  g.addEdge(1, 6)
  g.addEdge(2, 6)

  g.getVertex.foreach(a=>println(a))

  println("neighbour \n")

 g.getVertex.foreach {vertex=>
   println(s"${vertex}-> ${g.neighbour(vertex).mkString(", ")}")

 }


}


