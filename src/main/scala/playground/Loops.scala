package playground

object Loops extends App {

  // regular loop
  var start = 0
  val end = 5

  while (start < end){
    println(s"Hello you, I am looping with a while loop $start")
    start += 1
  }

  // Dont use while loops in Scala
  var start2 = 0
  // Think functionally = Expressions
  (start2 to end).foreach(n => (println(s"Hey you, now I am using foreach $n")))

  //transfrom a list, dont loop through it, apply a function to it
  var list1 = List(1, 2, 3)
  println(list1.map(x => x + 2)) //List(3, 4, 5)

  println(list1.flatMap(n => Seq.fill(n)(1)))

  println(list1.filter(n => n % 2 == 0))  // get only even numbers
  // fold, find, count, maxBy, sum, reduce

  // mature question = "How can I TRANSFORM this into what I want?"

  // foreach fallacy
  list1.foreach {x =>
    println(x)
  }

  // for comprehensions = EXPRESSIONS
  // example below to get all combinations
  println(for {
    x <- List(1,2,3)
    y <- List(6,7,8)
  } yield (x, s"testing $y"))

  // code above is the equivalent to the code below
  println(list1.flatMap(x => List(6,7, 8).map( y => (x, s"testing $y"))))


}
