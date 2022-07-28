package lectures.part2OOP

object OOPbasics extends App{
  val person = new Person("Pelle", 27)
  println(person.age)
  println(person.x)  // this can also be reached
  person.greet("Daniel")
  person.greet()
 // println(person.name)  --> wont work since there is no val before name
}

// can exist outside
// constructor
class Person(name: String, val age: Int = 0) {
  // class parameters are NOT FIELDS --> must have val before age to print and get it
  // anything can be inside the class body
  val x = 2
  println(1 + 2)

  def greet(name: String): Unit = println(s"${this.name} says Hello!, $name")

  // overloading --> same method name but different parameters
  def greet(): Unit = println(s"Hey I am $name")  //becomes this.name since it is empty

  // Multiple constructors
  def this(name: String) = this(name, 0)  // calls primary constructor
}



// Exercise
/*
Create a Novel and a Writer class
    Writer--> first name, surname, year
     -method fullname

 Novel --> name, year of release, author
 -autorAge
 -isWrittenBy(author)
 - copy (new year of release) = new instance of Novel
  */