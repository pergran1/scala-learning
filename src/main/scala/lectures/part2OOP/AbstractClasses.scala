package lectures.part2OOP

object AbstractClasses extends App{

  // abstract class Animal --> abstract class cant be instanciated
  abstract class Animal{
    val animal_type: String
    def eat: Unit
  }

  class Dog(animal_str: String) extends Animal{
    val animal_type: String = animal_str
    def eat: Unit = println("dog crunchely crunch")
    def sleeping: Boolean = false
  }

  // traits --> reminds of interface in Java
  trait Carnivore{
    def eat(animal: Animal): Unit
    val prefered_eat: String = "fresh meat"
    def animal_name(nam: String): Unit = println(s"name is $nam")
  }

  class Crocodile extends Animal with Carnivore{
    val animal_type: String = "evil croc"
    def eat: Unit = println("crock noise mumumumum")
    def eat(animal: Animal): Unit = println(s"I am a ${this.animal_type} so I eat ${animal.animal_type}")
  }




  val dog = new Dog("Pluto")
  val croc = new Crocodile

  croc.animal_type
  croc.eat //regular eat
  croc.eat(dog) // from carnivore
  croc.animal_name("name")  // can use methods and variables in traits
  println(croc.prefered_eat)
 // println(croc.sleeping)

  // traits vs abstract classes
  // 1. traits do not have constructor parameters
  // 2. multiple traits can be inherited by one class but only extends one class
  // 3. traits = behavior, abstract calss = "type of thing"


}
