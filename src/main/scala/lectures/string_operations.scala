package lectures

object string_operations extends App{
  val str: String = "This is a cool string in scala!"

  println(f"This is the charAt method: ${str.charAt(2)}" +" this also works: " +  str.charAt(2))
  println(str.substring(3,8)) // take part of string
  println(str.toLowerCase())
  println(str.split(" ").toList)
  println(str.startsWith("This"))
  println(str.replace(" ", "-"))
  println(str.toUpperCase())
  println(f"the lenght of the string is: ${str.length()}")
  println(str.reverse)
  println(str.take(2))

  val num_str: String = "45"
  val num: Int = num_str.toInt
  println(num + 5 + " " + num_str +  f" The num str is can be changed to a int with toInt")

  // s-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hey all, my name is $name and I am $age years old but will soon be ${age + 1}"
  println(greeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f per minute"  // F-interpolator can change format by ising "%2.2f"
  println(myth)
}
