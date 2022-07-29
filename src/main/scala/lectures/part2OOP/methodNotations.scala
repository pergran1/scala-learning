package lectures.part2OOP

object methodNotations extends App {

  class Person(val name: String, favorite_movie: String) {
    def likes(movie: String): Boolean = movie == favorite_movie

    def hang_out_with(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(person: Person): String = s"${this.name} is hanging with ${person.name}"

    //overload the method, shall return a new Person with a changed name
    def +(str: String): Person = new Person(s"${name} ($str)", favorite_movie )

    def apply(): String = s"My name is $name and I like $favorite_movie"

  }

  val mary = new Person("Mary", "gladiator")
  println(mary.likes("gladiator")) // true
  println(mary likes "gladiator")  // true, called infix notation = operator notation
  // only works with one parameter, --> called syntatic sugar
  val jerry = new Person("Jerry", "Godfather")
  println(mary.hang_out_with(jerry))  //regular way
  println(mary hang_out_with jerry)  // when there is only one parameter and we can use infix

  // apply method. The method must be named apply and then you can use () and nothing more
  println(mary())
  val testar = mary +"Testing this"
  println(testar.name)

}
