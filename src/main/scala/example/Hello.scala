package example

import scala.util.Try
import cats.data.EitherT
import java.util.concurrent.Future

object Hello extends Greeting with App {
  val testEither = Right(1)
  val r = Try(0/1).toEither
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}

