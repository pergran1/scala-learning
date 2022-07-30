package lectures.FPbasics

object Fpbasic extends App{

  // DREAM: use functions as first class elements
  // problem: oop
  // ALL SCALA FUNCTIONS ARE OBJECTS

  // 1. Create a function that concate 2 strings

   def concate_two_str(str1: String, str2: String): String = {
     str1 + str2
   }

  println(concate_two_str("part_1", "part_2"))


  // 2. A function that takes an int and returns another function that takes a int and returns a int


  def first_function(int1: Int): Int = {
    def second_function(int2: Int): Int = int2 + 4
    return second_function(int1)
  }

  println(first_function(4))
}

