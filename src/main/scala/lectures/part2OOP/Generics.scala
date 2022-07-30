package lectures.part2OOP

object Generics extends App{

  class MyList[A] {
    // use the type A
  }

  val list_of_integers = new MyList[Int]
  val list_of_strings = new MyList[String]

  // generic methods
  object MyList{
    def empty[A]: MyList[A] = ???
  }

  val empty_list_of_int = MyList.empty[Int]


  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes, List[Cat] extends List[Animal] = Covariance
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animeList: CovariantList[Animal] = new CovariantList[Cat]


  // 2. No = Invariance
  class invariant_list[A]
  val invariant_animal_list: invariant_list[Animal] = new invariant_list[Animal] // can only have Animal

  // 3. Hell no! Contravariance
  class Trainer[-A]
  val contra_list: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)


}


