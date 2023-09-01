/*
Handling Failures using recover and recoverWith:
recover: The recover method lets you provide a fallback value or computation to handle a failed Future.
It takes a partial function that matches the failed exception and returns a new value.
recoverWith: Similar to recover, but instead of returning a new value, you return a new Future to replace the failed one.
 */
import scala.concurrent.{Future, ExecutionContext}
import scala.util.{Success, Failure}

object FailureHandlingExample extends App {
  implicit val ec: ExecutionContext = ExecutionContext.global

  val failingFuture: Future[Int] = Future { throw new RuntimeException("Something went wrong") }

  val recoveredFuture: Future[Int] = failingFuture.recover {
    case _: RuntimeException => 0
  }

  recoveredFuture.onComplete {
    case Success(result) => println(s"Recovered Result: $result")
    case Failure(exception) => println(s"Error: ${exception.getMessage}")
  }
}
