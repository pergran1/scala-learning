package playground

import scala.annotation.tailrec

object Recursive extends  App{


    def factorial(n: Int ): Int = {
      @tailrec
      def go(n: Int, acc: Int): Int = {
        if (n <= 0) acc
        else go(n-1, n*acc)
      }
      go(n, 1)
    }

  // Use recursion as a regular loop
  def loop_rec(n: Int): Unit ={
    if (n <= 0) println("The end of the line")
    else {
      println(s"It now loops and the n is: $n")
      loop_rec(n-1)
    }
  }


  // Create a function that loops a list using recursive

  val listTest: List[Int] = List(1,2,3,4)

  def loop_list[A](theList: List[A]) = {
    val listLength = theList.length
    println(s"THe list is: $theList and the lenght is: ${theList.length}")
    def new_loop(n: Int):Unit  = {
      println(s"THe new loop list is $n")
      println(theList.apply(n))
      if(n <= 0 ) println("Nu tog det slut ")
      else {
        new_loop(n-1)
      }
    }

    new_loop(listLength-1)


  }

  println(listTest.apply(0))

  loop_list(listTest)
  loop_list(List("a", "B", "hej"))
  loop_rec(3)
  println(factorial(5))


  }



