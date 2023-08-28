import scala.collection.mutable

// Creating a mutable map
val myMap: mutable.Map[String, Int] = mutable.Map("one" -> 1, "two" -> 2)

// Adding a new key-value pair using the += operator
myMap += ("three" -> 3)

// Printing the updated map
println(myMap)

/////////////////////////////////////////////////
import scala.collection.mutable

// Creating a mutable map
val myMap: mutable.Map[String, Int] = mutable.Map("one" -> 1, "two" -> 2)

// Adding a new key-value pair using the put method
myMap.put("three", 3)

// Printing the updated map
println(myMap)
