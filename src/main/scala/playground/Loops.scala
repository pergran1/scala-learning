package playground

object Loops extends App {

  // regular loop
  var start = 0
  val end = 5

  while (start < end){
    println(s"Hello you, I am looping with a while loop $start")
    start += 1
  }
}
