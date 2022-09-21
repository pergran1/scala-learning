package playground

object HigherOrderFunctions extends App{

  def addValue(nbr: Int):Double = nbr + math.random()

  def multiplyValue(nbr: Int):Double = nbr * math.random()

  // now we can use the function above
  // f represent the function, takes and Int and gives a Double
  def changValue(nbr: Int, f: Int => Double): Double = f(nbr)

  println(changValue(5, addValue))
  println(changValue(5, multiplyValue))

  // changed it to take a more generic function
  def changValue2[A](nbr: Int, f: Int => A): A = f(nbr)

  def intToString(nbr: Int): String = nbr.toString


  def over100(nbr: Int): Boolean = if (nbr > 100) true else false
  def under50(nbr: Int): Boolean = if (nbr < 50) true else false

  println(changValue2(3, addValue))

  println(changValue2(6, intToString))

  def testar(nbr: Int, f: Int => Boolean): Boolean = {
    f(nbr)
  }





}
