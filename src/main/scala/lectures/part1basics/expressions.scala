package lectures.part1basics

object expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)
  println(2 + 4 * 4)
  println(1 == x)
  // + - * / & | ^ << >> >>>
  println(!(1 == x)) // not
  println(1 != x)

  // && (means and)  || (means or)

  var a_variable = 2
  a_variable += 3 // changes variables --> side effect
  println(a_variable)

  // Instructions (Do something) vs Expressions (Value or type)

  // IF expression
  val a_condition = true
  val a_condition_value = if (a_condition) 5 else 3 // if expression
  println(a_condition_value)
  println(if (a_condition) 5 else 3)

  // loops
  // Avoid loops because it is instructional programming
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // Everything in Scala is an Expression!

  val a_weird_value = a_variable += 3 // Unit === void
  print(a_weird_value)

  // side effects: println(), whiles, reassigning

  // Code blocks
  val a_code_block = {
    val y = 2
    val z = y + 6
    // the z only exist in the code block
    // value of the block is the value of the last expression
    if (z > 3) "hello" else "goodbye"
  }


}
