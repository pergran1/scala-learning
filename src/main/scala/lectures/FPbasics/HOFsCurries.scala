package lectures.FPbasics

object HOFsCurries extends App{
  // Takes a int and a function
  // Higher order function, HOF
  val super_function: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = ???

  // map, flatMap, filter in mylist

  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else
      ???

}
