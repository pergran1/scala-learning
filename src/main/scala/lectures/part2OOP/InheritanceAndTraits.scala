package lectures.part2OOP

object InheritanceAndTraits extends App{

  // Superclass becuase Cat inerhnce from it
  class Animal{
    // can use protected before the method
    val animal_type = "wild"
    def eat: String = "nomnom"
  }

  // Cat ärver från Animal, inheritance
  class Cat extends Animal{

    def crunch = eat + " hard to eat"
    def testar: Boolean = false
  }

  val kissekatt = new Cat

  println(kissekatt.eat) // wont be able to use if the method is protected or private
  println(kissekatt.crunch)
  println(kissekatt.testar)

  class Person(name: String, age: Int)
                                                      // must add the parameters from superclass
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding
  class Dog(dogType: String) extends Animal{
    override val animal_type: String = dogType  // can override functions and values from animal class

    override def eat: String =  " dog crunchely crunch"
    def super_test = super.eat + eat
  }

  val dog = new Dog("home dog")
  println(dog.eat) // uses the eat method from Dog
  println(dog.animal_type)  //also works for values


  // this is polymorphism, could be any animal if we had more subclasses
  val unknown_animal: Animal = new Dog("wild dog")
  println(unknown_animal.eat) // knows it is a dog

  // Super --> when we want to use a method from the superclass
  println(dog.super_test) // uses the super in this method, wont work on unkown_animal
}
