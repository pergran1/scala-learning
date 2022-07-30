package lectures.part2OOP

object CaseClasses extends App{
  /*
  equals, hashcode, toString
   */

  case class Person(name: String, age: Int)
  // 1. class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)  // can reach the parameter

  // 2. sensible toString
  println(jim.toString)

  // 3. equals and hashcode implemented OOTB
  val jim_fake = new Person("Jim", 34)
  println(jim == jim_fake) // becomes true

  // 4. CCs have handy copy method
  val jim_2 = jim.copy(age = 45)
  println(jim_2)  //same as jim but different age

  // 5. CCs have companion objects
  val the_person = Person
  val mary = Person("Mary", 23) // dont need new when CCs

  // 6. CCs are serializable
  // Important for Akka

  // 7. CCs have extractor patterns == CCs can be used in pattern matching

  case object united_kingdom {
    def name: String = "The UK of GB and NI"
  }


}
