import sun.security.provider.certpath.Vertex

import scala.collection.mutable

class Graph{
  //edge
  //vertex
  //adjancy list (key , set (value))

  private val adjacencyList: mutable.Map[Int,mutable.Set[Int]]=mutable.Map()

  def addVertex(vertex:Int): Unit = {
   if(!adjacencyList.contains(vertex)){
     adjacencyList(vertex)=mutable.Set()
   }
 }
  def addEdge(vertex1:Int,vertex2:Int): Unit = {
    addVertex(vertex1)
    addVertex(vertex2)
    adjacencyList(vertex1)+=vertex2
    adjacencyList(vertex2)+=vertex1
  }

  def getVertex() : Iterable[Int]=adjacencyList.keys

  def findNeibours(vertex:Int):Iterable[Int]={
    adjacencyList.getOrElse(vertex,mutable.Set())
  }
}

//object Main extends App{
  val g=new Graph

g.addEdge(1,2)
g.addEdge(1,3)
g.addEdge(3,4)


val n=g.findNeibours(1)
n.foreach(a=>println(a))
g.getVertex()



//}