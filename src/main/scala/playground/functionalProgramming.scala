package playground

// https://www.udemy.com/course/fast-scala/learn/lecture/27123394#learning-tools

object functionalProgramming extends App{

  // Scala is OO
  class  Person(name: String){
    def apply(age: Int) = println(s"I have aged $age years")
    
  }
  
  val bob = new Person("Bob")
  bob.apply(43)
  bob(43) // INVOKING bob as a function === bob.apply(43)

  /*
  Scala runs on the JVM
  Functional programming:
  - compose functions
  - pass functions as args
  - return functions as results
   */

  val simple_incrementer = new Function[Int, Int] {
    override def apply(arg: Int): Int = arg + 1
  }

  simple_incrementer.apply(23) // 24
  simple_incrementer(23) // same as simple_incrementer.apply(23)

  val string_concat = new Function2[String, String, String] {
    override def apply(arg1: String, arg2: String):String = arg1 + arg2
  }

  println(string_concat("I love", " scala"))

  // Syntax sugars
  val doubler: Function1[Int, Int] = (x: Int) => 2 * x
  println(doubler(5))
  /*
  Instead of:
  new Function[Int, Int]{
    override def apply(x: Int) = 2 * x
    }
   */

  // High-order functions:
  // take functions as args/return functions as results
  // Example:

  val a_mapped_list = List(1,3,5,6).map(x => x + 4.2) // HOF, returns another list
  println(a_mapped_list)

  val a_flatmapped_list = List(3,5, 6).flatMap(x => List(x, x* 2))
  println(a_flatmapped_list)

  val a_flatmapped_list2 = List(3,5, 6).flatMap {
    x => List(x, x* 2)
  } // alternative syntax


  val filter_list = List(1, 2, 3, 4).filter(x => x <= 3)
  println(filter_list)

  val filter_list2 = List(1,2,3,4,5,6).filter(_ <= 3) // same as x => x <=

  // all pairs between number 1,2,3 and letters a, b, c

  val all_pairs = List(1,2,3).flatMap(number => List('a', 'b', 'c').map(letter => s"$number-$letter"))

  println(all_pairs)

  // for comprehensions as as above but easier, this is not a for loop
  // reminds me of zip in python
  val new_all_pairs = for {
    number <- List(1,2,3)
    letter <- List("a", "b", "c")
  } yield s"$number - $letter"
  println(new_all_pairs)

  /*
  Different collections
   */

  // Lists
  val alist = List(1,2,3,4,5) // has a head and a tail
  val firstelement = alist.head
  val rest = alist.tail // all except the first
  println(rest)
  val prependded_list = 0 :: alist // append to the first List(0,1,2,3,4,5)
  val append_last_list = 0 +: alist :+ 6 //append to the first and last List(0,1,2,3,4,5, 6)

  // Sequences
  val asequence: Seq[Int] = Seq(1,2,3)  // Seq.apply(1,2,3)
  val accessedElement = asequence(1) // The element at index 1 = 2

  // sets = no duplicates
  val aSet = Set(1,2,3,4,3,2,3) //the duplicates will be removed
  println(aSet.contains(5)) //false, 5 is not in that set
  val anAddedSet = aSet + 5
  val aRemovedSet = aSet - 3 // remove 3 from the set

  // ranges
  val aRange= 1 to 1000
  println(aRange)

  val twoBytwo = aRange.map( x => 2 * x).toList // all even numbers to 2000
  println(twoBytwo)

  // tuples = groups of values under the same value
  val aTuple = ("Bon Jovi", "Rock", 1982)

  // maps = Dictionary in python
  val aPhonebook: Map[String,Int] = Map(
    ("Daniel", 98745),
    "Jane" -> 47654 //same as ("Jane", 47654) so you can use a tuble in a map
  )

  println(aPhonebook)



}
