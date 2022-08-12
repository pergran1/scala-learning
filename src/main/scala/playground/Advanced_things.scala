package playground

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}
import  scala.concurrent.ExecutionContext.Implicits.global

object Advanced_things extends  App{

  // lazy evaluation --> evoked only when used
  lazy val a_lazy_value = 2
  lazy val  lazy_value_with_side_effects = {
    println("I am so very lazy")
    43
  }

  val eagerValue = lazy_value_with_side_effects + 1
  // useful in infinite collections

  // pseudo-collections": Option, Try
  def method_can_return_null():  String = "hello, scala"



  val an_option = Option(method_can_return_null()) // Some"(hello, scala")
  val stringProcessing = an_option match {
    case Some(string) => s"I have obatained a valid string: $string"
    case None => "I got nothing"
  }

  //if (method_can_return_null() == null){
  // We dont need to do this like in java
  //}


  // map, flatMap, filter
  def method_which_can_throw_exception(): String = throw new RuntimeException
  val a_try = Try(method_which_can_throw_exception())
  //a try = "collection" with either a value if the code went well, or an exception if the code threw one


  val anotherStringProcessing = a_try match {
    case Success(validValue) => s"I have a valid value $validValue"
    case Failure(ex) => s"I got a exception $ex"
  }

  println(anotherStringProcessing)

  /*
  Evaluate something on another thread
  (asynchrounous programming)

   */
  val a_future = Future({
    println("Loading...")
    Thread.sleep(1000)
    println("I have computed a value")
    49
  })

  // future is a "collection" which contains a value when it's evaluated
  // future is composabe with map, flatMap and filter
  // monads

  /*
  Implicits basics
   */
  // #1: implicits arguments
  def method_with_implicit_args(implicit  arg: Int): Int = arg + 1
  implicit val my_implicit_val = 46
  println(method_with_implicit_args) //method_with_implicit_args(my_implicit_val)

  // 2. Implicit conversision
  implicit class my_rich_integer(n: Int){
    def is_even() = n % 2 == 0
  }
  println(23.is_even()) // new my_rich_integer.(23).is_even(

}
