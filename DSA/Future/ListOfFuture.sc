/*
If you have a list of futures like List[Future[Type1], Future[Type2], ...]
and you want to convert it into a list of Future objects (List[Future[Type]]),
where Type is a common type that these futures will resolve to, you can use the Future.
sequence method. This method takes a list of futures and returns a single future that
completes with a list of results when all the input futures are completed.
 */
import scala.concurrent.{Future, ExecutionContext}
import scala.util.{Success, Failure}

object FutureListConversionExample extends App {
  implicit val ec: ExecutionContext = ExecutionContext.global

  // Sample Future instances
  val future1: Future[String] = Future.successful("Result from Future 1")
  val future2: Future[String] = Future.successful("Result from Future 2")
  val future3: Future[String] = Future.successful("Result from Future 3")

  // List of Future instances
  val futureList: List[Future[String]] = List(future1, future2, future3)

  // Convert the list of Future instances into a single Future[List[String]]
  val combinedFuture: Future[List[String]] = Future.sequence(futureList)

  // Handle the result of the combined future
  combinedFuture.onComplete {
    case Success(results) =>
      println("All futures completed successfully.")
      results.foreach(println)

    case Failure(exception) =>
      println(s"An error occurred: ${exception.getMessage}")
  }
}
