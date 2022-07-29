package lectures.part2OOP
import java.time.Year
import java.io.Writer

object OOPbasics extends App{
  val person = new Person("Pelle", 27)
  println(person.age)
  println(person.x)  // this can also be reached
  person.greet("Daniel")
  person.greet()
 // println(person.name)  --> wont work since there is no val before name

  val w1 = new Writer("Leif GW", "Persson", 72)
  println(w1.full_name())

  val police_book = new Novel("The new detective", 2019, new Writer("Leif GW", "Persson", 72))
  println(police_book.get_name())
  println(police_book.get_age())
  println(police_book.get_realse_year())
  police_book.testar(2021)

  police_book.copy(2042)

  println(police_book.get_realse_year())

  println("THe new year is now " + police_book.get_realse_year())
  police_book.year_of_release
  println("THe new year is now " + police_book.get_realse_year())

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

class Writer(first_name: String, surname: String, val year: Int) {

  def full_name(): String = s"$first_name $surname"

}

// author is an instance of Writer
class Novel(name: String, var year_of_release: Int, author: Writer){

  def get_name(): String = name

  def get_age(): Int = {
    val year = Year.now.getValue
    // Returns the age of the author on the year of the release
    val years_between = year - year_of_release  // 2022-2019 = 3
    author.year - years_between // 72-3
  }

  def written_by(): String =
    author.full_name()

  def same_author(author: Writer) = author == this.author

  def copy(new_year:Int ): Novel = new Novel(name, new_year, author)

  // One way to change year of release, must be var
  def testar(new_year: Int ):Unit = this.year_of_release = new_year


  def get_realse_year(): Int = year_of_release



}