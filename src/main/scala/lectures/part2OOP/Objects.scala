package lectures.part2OOP

object Objects extends App{

  // Scala does not have class-level functionality ("static")
  object Person{ // type + its only instance
    // static/ class - level functionality
    val N_EYES = 2

    def can_fly: Boolean = false

    def apply(name: String, mother: Person, father: Person): Person = new Person(name)
  }

  class Person(val name: String){
    // Instance-level functionality
  }
  // Objects and Class in same is called Companions

  println(Person.N_EYES)
  println(Person.can_fly)

  // scala object = SINGLETON INSTANCE

  val mary = Person
  val john = Person
  println(mary == john)  // points to the same object

  val per = new Person("Per")
  val lars = new Person("lars")

  val erik = Person("erik", per, lars) // this uses the apply method in the Object. Compare to mary and per

  // Scala applications
  // def main(args: Array[String]): Unit

}
