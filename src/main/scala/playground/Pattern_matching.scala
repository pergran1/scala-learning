package playground

object Pattern_matching extends App{

  // use as switch expression
  val an_integer = 55
  val order = an_integer match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => an_integer + "th" // default
  }

  println(order) //returns 55th

  case class Person(name: String, age: Int)

  val bob = Person("Bob", 43) // no new needed for case class

  val person_greeting = bob match {
    //matches against a structure
    // only for case classes
    case Person(n, a) => s"Hello, my name is $n and I am $a years old"
    case _ => "Are you really a person?!"
  }

  println(person_greeting)

  // deconstructing tuples
  val a_tuple = ("Bon Jovi", "Rock")
  val band_description = a_tuple match {
    case (band, genre) => s"$band belongs to the genre $genre"
    case _ => "I dont know what you are talking about"
  }
  println(band_description)

  // decomposint lists
  val a_list = List(1,2,3)
  val a_list_description = a_list match {
    case List(_, 2, _) => "List containing 2 on its second position" //list most have 3 values
    case _=> "unknown list"
  }

  // If PM doesn't match anything it will throw a MatchError
  // PM will try all cases in sequence

  println(a_list_description)


}
