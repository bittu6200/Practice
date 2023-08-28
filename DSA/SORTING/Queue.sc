
import scala.collection.mutable
import scala.collection.mutable._

var queue=mutable.Queue(1,2,3,4,5)
queue.foreach((e:Int)=>print(e+" "))
queue:+10
queue.enqueue(12)
queue.front
println(queue.dequeue)
