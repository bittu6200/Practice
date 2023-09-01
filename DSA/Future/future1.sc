import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Success,Failure}
object TestFuture extends App{
  val arithemeticFuture = Future {
    100/0
  }
  arithemeticFuture onComplete {
    case Success(_) => println("Future completed successfully.")
    case Failure(error) => println(s"Future completed with error: ${error}.")
  }
  Thread.sleep(1000)
}