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

  try {
    //code that might throw
    get_int(true)
  } catch {
    case e: RuntimeException => println("Caught a Runtime exception")
  } finally {
    // code that will always run
    println("Finally!!")
  }




}
