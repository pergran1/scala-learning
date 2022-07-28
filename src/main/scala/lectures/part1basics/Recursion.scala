package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  //@tailrec this will create a error since it is not tailrecursion
  def factorial2(n: Int): Int = {
    if (n <= 1) 1
    else {
      println(f"Computing factorial of $n but I first need factorial of ${n - 1}") // to see of it thinks
      val result = n * factorial2(n - 1)
      println(f"Computed factorial of $n")

      result
    }
  }

  println(factorial2(10)) // wont work with big number like 5000, out of memory

  def another_factorial(n: Int): BigInt = {
    @tailrec // can use this to make sure that it is a tail recursive, error if not
    def fact_helper(x: Int, accumolator: BigInt): BigInt =
      if (x <= 1) accumolator
      else fact_helper(x - 1, x * accumolator) // tail recursive, will work with big numbers

    fact_helper(n, 1)
  }

  // when you need loops use tail recursion

  // Test 1. Concate a string n times with tail recursion
  @tailrec
  def concate_string(str: String, n: Int, accumulator: String = ""): String = {
    // the accumulator has a default str as "", it will add each run
    if (n <= 0) accumulator
    else concate_string(str + "ö", n - 1, str + accumulator)
  }

  println(concate_string("hello", 6))

  // Test 2. Is Prime function with tail
  def is_prime(n: Int): Boolean = {
    @tailrec
    def is_prime_tail(t: Int, is_still_prime: Boolean): Boolean =
      if (!is_still_prime) false
      else if (t <= 1) true
      else is_prime_tail(t - 1, n % t != 0 && is_still_prime)

    is_prime_tail(n / 2, true)

  }

  println(is_prime(2003))
  println(is_prime(629))

  // Test 3. fibonacci number
  def fibonacci(n: Int): Int = {
    @tailrec
    def fibo_tail(i: Int, last: Int, next_to_last: Int): Int =
      if (i >= n) last
      else fibo_tail(i + 1, last + next_to_last, last)

    if (n <= 2) 1
    else fibo_tail(2, 1, 1)
  }

  println(fibonacci(8)) // 1 1 2 3 4 8 13 => 21
}
