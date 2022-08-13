package lectures.FPbasics

object MapFlatmapFilter extends App{

  val list = List(1,2,3)
  println(list)
  println(list.head)
  println(list.tail)
  list
  // for loop
  for (x <- list){
    println(x)
  }

  list.foreach(println)

  // map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  // filter
  println(list.filter(_ % 2 == 0))  // get all values in list that are even

  // flatmap
  val toPair = (x: Int) => List(x, x+1)
  println(list.flatMap(toPair))

  val numbers = List(1,2,3,4)
  val chars = List('a', 'b', 'c','d')
  val colors = List("black", "white")
  // for-comprehensions
  val for_combinations = for{
    n <- numbers
    c <- chars
    color <- colors
  } yield "" + c + n + "-" + color

  println(for_combinations)


  // here I can use a filter
  val for_combinations2 = for{
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  } yield "" + c + n + "-" + color

  println(for_combinations2)

  for {
    n <- numbers
  } println(s"this is for $n")

  // syntax overload
  list.map { x =>
    x * 2
  }

  /*
  Exercises
  1. MyList supports for comprehensions?
  2. A small collection of at most ONE element - Maybe[+T]
    - map, flatMap, filter
   */

}
