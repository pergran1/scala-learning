package Exercises
// https://www.w3resource.com/scala-exercises/basic/index.php

// Another website with problems to solve: http://aperiodic.net/phil/scala/s-99/

object w3resourceBasic extends App{


  // 2. Write a Scala program to compute the sum of the two given integer values.
  // If the two values are the same, then return triples their sum
  def sum2(nbr1: Int, nbr2: Int): Int =   {
    if (nbr1 == nbr2) return nbr1 * 3
    nbr1 + nbr2
  }

  println(s"When not using the same: ${sum2(5,8)}")
  println(s"Using the same nbr, should be tripled: ${sum2(7,7)}")


  // 3. Write a Scala program to get the absolute difference between n and 51.
  // If n is greater than 51 return triple the absolute difference
  def absDiff51(nbr: Int): Int = {
    if(nbr > 51) (nbr - 51) * 3
    else
      51 - nbr
  }

  println(s"Negative value: ${absDiff51(-5)}")
  println(s"Positive less value: ${absDiff51(31)}")
  println(s"Greater than 51 value: ${absDiff51(60)}")

  // 4. Write a Scala program to check two given integers
  // and return true if one of them is 30 or if their sum is 30
  def check30(nbr1: Int, nbr2: Int): Boolean = {
    nbr1 == 30 || nbr2 == 30 || (nbr1 + nbr2) == 30
  }
  println(s"Should be true ${check30(30, 3)}")
  println(s"Should be true ${check30(20, 10)}")
  println(s"Should be false ${check30(20, 13)}")


  // 6. Write a Scala program to create a new string
  // where 'if' is added to the front of a given string.
  // If the string already begins with 'if', return the string unchanged
  def addIf(str: String): String = {
    if (str.startsWith("if")) return str
     s"if $str testing"
  }

  println(addIf("if there was a good day"))
  println(addIf("hello good sir"))


  //  Write a Scala program to remove the character in a given position of a given string.
  //  The given position will be in the range 0...string length -1 inclusive
  def removeChar(str: String, index: Int): String = {
    str.substring(0, index) + str.substring(index+1)
  }
  println(removeChar("hello", 0))

  //Write a Scala program to exchange the first and last characters in a given string and return the new string
  def replaceFirstLast(str: String): String = {
    val firstLetter = str.head
    val lastLetter = str.last


    lastLetter + str.substring(1, str.length-1) + firstLetter
  }
println(replaceFirstLast("scala"))
}
