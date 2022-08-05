package playground

import scala.collection.mutable

object Maps extends App{

  // Create a map
  val pets = scala.collection.mutable.Map(
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
  pets.updateWith("city")({ case Some(list) => Some("add_this" :: list) case None => Some(List("add_this")) })

  // if the key does exist than the below code is enouth
  pets.updateWith("city")({ case Some(list) => Some("add_this2" :: list) })
  println(pets)


def insert_metric_values(fanfic_id: String, link: String, text: String, html_soup: String): Unit = {

  // Map for Fanfiction, the keys are the heading and the values are the class when webscraping
  val metric_map = scala.collection.mutable.Map(
    "dd" -> List("rating", "category", "fandom", "relationship",
      "character", "language", "published", "words",
      "chapters", "comments", "kudos", "bookmarks",
      "hits"),
    "h2" -> List("title")
  )
  metric_map.get("dd").get.foreach(x => println("Insert_metric_values " + x))

  // using keys
  metric_map.keys.foreach( key => metric_map(key).
    foreach(list_value => if (list_value == "words")
    println("hoho") else //example of using if in a for each
    println( s"testar.select($key.$list_value).text())" ) ))

}

  insert_metric_values("1", "4", "t", "5")




  def read_fanfictions(fanfic_list: List[String]): mutable.Map[String, List[String]] = {
    // Creates a map with keys as the corresponding data and List that will populate the data for each key
    // One input in each list should be seen as a row or fanfic

    // Create map that will contain all the data when webscraping a fanfic
    val fanfic_map: mutable.Map[String, List[String]]  = mutable.Map("id" -> List(), "link"-> List(), "text"-> List(),
      "link"-> List(), "rating"-> List(), "category"-> List(), "fandom"-> List(), "relationship"-> List(),
      "character"-> List(), "language" ->List(), "published"-> List(), "words"-> List(), "chapters"-> List(),
      "comments"-> List(), "kudos"-> List(), "bookmarks"-> List(), "hits"-> List(), "title heading"-> List(),
      "author"-> List()
    )
    fanfic_map

  }


  // Create two functions, one function creates a map and the other function updates and returns the map

  def insert_into_map(map_list: mutable.Map[String, List[String]]): Unit ={
    map_list.updateWith("home")({ case Some(list) => Some("add_this2" :: list) })
    map_list.updateWith("home")({ case Some(list) => Some("add_this3" :: list) })
    //println(map_list)
  }

  def create_map():mutable.Map[String, List[String]] = {
    // Create map with known keys and empty lists as value
    // Must specifiy that is is a List[String] otherwise it will belive it is nothing and get error
    val pets: mutable.Map[String, List[String]] = mutable.Map(
      "home" -> List(),
      "farm" -> List()
    )

    //println(pets.updateWith("home")({ case Some(list) => Some("add_this2" :: list) }))
    insert_into_map(pets)

    return pets
  }

  println(create_map())

  def add2(x: Int): Int = x +2

  add2(4)

  println(read_fanfictions(List("1")))

}
