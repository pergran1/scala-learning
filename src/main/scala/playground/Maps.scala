package playground

object Maps extends App{

  // Create a map
  val pets: scala.collection.mutable.Map[String, List[String]] = scala.collection.mutable.Map(
    "home" -> List("cat", "dog", "fish"),
    "farm" -> List("cow", "horse"),
    "wild" -> List("tiger", "elephant"),
    "city" -> List()
  )
  println(pets)  // Prints the whole map
  println(pets("farm"))  // select the key for farm

  // Different loops
  pets.foreach(test => println("This is " + test))

  for ((k,v) <- pets) println(s"key: $k, value: $v")

  println("")
  pets.foreach(pair => println(s"Key: ${pair._1}, Value: ${pair._2}")) // same as the one above

  pets("wild") :: List("test")
  println(pets)


  // Add things to a map where the values are list
  val aKey = "aa"
  var myMap = scala.collection.mutable.Map[String, List[String]]()
  if (myMap.exists(_._1 == aKey))
    myMap.get(aKey).get :+ "foo"
  else {
    myMap(aKey) = List("zoo")
  }
  println(myMap)

  // Another way to add values with updateWith
  // Use the one below if the key might not exist, then it create a key and insert value into list
  pets.updateWith("city")({ case Some(list) => Some("add_this" :: list) case None => Some(List("test")) })

  // if the key does exist than the below code is enouth
  pets.updateWith("city")({ case Some(list) => Some("add_this2" :: list) })
  println(pets)


}
