package lectures

object values_variables_types extends App{
  val x: Int = 42

  // You dont need to specify the variable type, like "Int"

  val y = 3  // this also works

 // val z: Int = "hekko" this wont work

  println(x +y)

  // VALS ARE IMMUTABLE, CANT BE CHANGED
  // val stands for value and var stands for varialbe, see the bottom
  // Example below wont work
  // x = 2

  val one_string: String = "hello there"
  println(one_string)

  val boolean_example: Boolean = false
  val a_char : Char = 'p'
  val a_int: Int = 12
  val a_short: Short = 4613  //not so big integer
  val a_long: Long = 52739852763585L   //add L in the end
  val a_float: Float = 0.012f
  val a_double: Double = 1.2

  // Instead of val is used var (for variable) and this can be changed
  var a_variable: Int = 5
  // changed
  a_variable = 4
  println(f"The variable is $a_variable")  //using f string
  println(f"Test for variable ${a_variable + x} " + (a_variable + x))
}
