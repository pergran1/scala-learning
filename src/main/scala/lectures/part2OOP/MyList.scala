package lectures.part2OOP
// example of a linked list


abstract class MyList {

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList // returns a new instance when modifiying
  def printElements: String
  override def toString: String = "[" + printElements + "]"

}


object Empty extends MyList {
   def head: Int = throw new NoSuchElementException //when called on empty list

   def tail: MyList = throw new NoSuchElementException

   def isEmpty: Boolean = true

   def add(element: Int): MyList = new Cons(element, Empty)

  def printElements: String = ""
}

class Cons(h: Int, t: MyList) extends MyList {
   def head: Int = h

   def tail: MyList = t

   def isEmpty: Boolean = false

   def add(element: Int): MyList = new Cons(element, this)

   def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}

object ListTest extends App {
  val list = new Cons(3, Empty)
  println(list.head)
  list.add(4)
  list.add(7)
  println(list.add(4).head)
  println(list.isEmpty)

  // polymorphics call
  println(list.toString)

}
