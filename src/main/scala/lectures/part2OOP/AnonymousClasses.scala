package lectures.part2OOP

object AnonymousClasses extends App{

  abstract class Animal {
    def eat: Unit
  }

  //anonymous class
  val funny_animal: Animal = new Animal {
    override def eat: Unit = println("ahahaha")
  }

  println(funny_animal.getClass)

  class Person(name: String){
    def say_hi: Unit = println(s" Hello, my name is $name how can I help?")
  }

  val jim = new Person("Jim"){
    override def say_hi: Unit = println(s"Tjenare, detta är på svenska och mitt namn är")
  }

  jim.say_hi
}
