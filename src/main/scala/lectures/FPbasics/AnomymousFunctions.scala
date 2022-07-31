package lectures.FPbasics

object AnomymousFunctions extends App{

  // anonymouys function (LAMBDA)
  val doubler = (x: Int) => x*2

  println(doubler(4))

  // multiple parameters
  val adder = (a: Int, b:Int) => a + b

  println(adder(100, 4))

  // no params
  val just_something = () => 3  //just returns 3

  println(just_something()) // lambdas must be called with parentheses

  // curly braces with lambdas, COMMON way to write lambdas
  val string_to_int = { (str: String) =>
    str.toInt
  }

  // MOAR syntactic sugar
  val nice_incrementer: Int => Int = _ + 1 // equivalent to x => x + 1

}
