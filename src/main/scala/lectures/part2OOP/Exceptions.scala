package lectures.part2OOP

object Exceptions  extends App{

  val x: String = null

 // println(x.length) // crash with nullpointer
  // throwing and catching exceptions

  //val a_weird_value  = throw new NullPointerException // this will create a crash

  // throwable classes extend the Throwable class
  // Exception and Error are major Throwable subtypes

  // How to catch Exceptions ------------------
  def get_int(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No in for you")
    else 42

  // dont need to create a val
  val potential_fail = try {
    //code that might throw
    get_int(true)
  } catch {
    // select what should happen
    case e: RuntimeException => println("Caught a Runtime exception")
  } finally {
    // code that will always run
    // this finally block is optional
    // does not influence the return type of this exception
    // use finally only for side effects, example logging
    println("Finally!!")
  }

  // 3. How to define your own exceptions
  class my_exception extends Exception
  val exception = new my_exception
  
  throw exception




}
