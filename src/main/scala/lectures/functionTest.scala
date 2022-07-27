package lectures

object functionTest extends App{
  // after parantheses there are a return type
  def a_function(para_1: String, para_2:Int): String = {
    para_1 + " " + para_2
  }

  println(a_function("hello", 3))

// Instead of using a while loop
  def repeated_function(a_string: String, n:Int): String = {
    if (n == 1) a_string
    else a_string + repeated_function(a_string, n -1)  //reursive
  }

  println(repeated_function("testing", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION
  // https://blog.rockthejvm.com/scala-looping/
  // https://www.lihaoyi.com/post/WhatsFunctionalProgrammingAllAbout.html
  val testara = List(1,2,3).map(x => x + 3)
  println(testara)

  def function_with_side_effects(a_String: String): Unit = println(a_String)

  function_with_side_effects("hohoho")

  def a_big_function(n: Int): Int ={
    // can create a function inside another function
    def a_smaller_function(a: Int, b: Int): Int = a + b
    a_smaller_function(n, n+3) //returns
  }

  println(a_big_function(4))

}
