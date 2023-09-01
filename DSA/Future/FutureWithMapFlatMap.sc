/*
Parallel Execution using map and flatMap:
map: You can use the map method on a Future to transform its result once it completes.
This transformation happens asynchronously when the future is successful.
flatMap: The flatMap method is used to chain multiple Future computations together.
It's particularly useful when you want to execute a sequence of asynchronous operations in a specific order.
 */
import scala.concurrent.{Future, ExecutionContext}
import scala.util.{Success, Failure}

object ParallelExecutionExample extends App {
  implicit val ec: ExecutionContext = ExecutionContext.global

  val future1: Future[Int] = Future { 2 + 2 }
  val future2: Future[Int] = Future { 5 * 3 }

  val combinedFuture: Future[Int] = future1.flatMap(result1 =>
    future2.map(result2 => result1 + result2)
  )

  combinedFuture.onComplete {
    case Success(result) => println(s"Result: $result")
    case Failure(exception) => println(s"Error: ${exception.getMessage}")
  }
}
