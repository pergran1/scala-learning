package playground
// https://www.youtube.com/watch?v=d-dy1x33moA

object Monads extends App{

  case class SafeValue[+T](private val internalValue: T){ // constructor = pure, or unit
    def get: T = synchronized{
      // does something interesting
      internalValue
    }

    // ability to transform internalvalue
    def transform[S](transformer: T => SafeValue[S]): SafeValue[S] = synchronized{ //called bind or flatmap
      transformer(internalValue)
    }
  }
  // "external" API
  def gimmeSafeValue[T](value: T): SafeValue[T] = SafeValue(value)

  val safeString: SafeValue[String] = gimmeSafeValue("Scala is awesome")
  println(safeString)

  // extract
  val string = safeString.get
  //transform
  val upperString = string.toUpperCase()
  // wrap
  val upperSafeString = SafeValue(upperString)
  // ETW

  // Now we can use only one line, monad!
  val upperSafeString2 = safeString.transform(s => SafeValue(s.toUpperCase()))
  println(upperString)

  // Exemples
  //Example 1: census
  case class Person(firstName: String, lastName: String){
    assert(firstName !=null && lastName != null)
  }

  // census api  --> names could be null see if it is
  def getPerson(firstName: String, lastName: String): Person =
    if (firstName != null){
      if (lastName != null){
        Person(firstName, lastName)
      } else {
        null
      }
    } else {
      null
    }

  def getPersonBetter(firstName: String, lastName: String): Option[Person] =
    Option(firstName).flatMap { fName =>
      Option(lastName).flatMap { lName =>
        Option(Person(fName, lName))
      }
    }

}


