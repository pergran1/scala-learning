package lectures.part1basics

// https://www.udemy.com/course/rock-the-jvm-scala-for-beginners/learn/lecture/7660632#overview
object call_by_value extends App {
  def called_by_value(x: Long): Unit = {
    println(f"by value: $x")
    println(f"by value: $x")
  }

  def called_by_name(x: => Long): Unit = {
    println(f"by name: $x")
    println(f"by name: $x")
  }

  called_by_value(System.nanoTime()) //this returns on the same time, is evaluated before and same time is used
  called_by_name(System.nanoTime()) // this does not, evaluated every time so the time is changed
  //called by name is good in lazy streams

  def infinite(): Int = 1 + infinite()

  def print_first(x: Int, y: => Int) = println(x)

  print_first(34, infinite()) //does not crash because infinite is never used, it never evaluates
}
