import scala.collection.mutable.ListBuffer

val list=List(1,2,3,4)
55 +: list
println(list.head)
println(res0.head)
list.tail
list.mkString
//////////////////////
val coll:List[List[Int]] =list.map(x=>List(x,x+1))

list.flatMap(x=>List(x,x+1))

list.map(x=>List(x,x+1).sum)

list.reverse

list.fold(0)(_+_)
list.foldRight(0)(_+_)


list.foreach(a=>println(a))

val p=ListBuffer(1,2,3,4)
p+=9 // addition in listbuffer
p.remove(0,2)
p-=4
p
///////////////////////////////
// Scala program to concatenate two array
// by using concat() method

// Scala program to concatenate two array
// by using concat() method

import Array._

// Creating object


  // Main method

    var arr1 = Array(1, 2, 3, 4)
    var arr2 = Array(5, 6, 7, 8)

    var arr3 = concat(arr1, arr2)

    // Print all the array elements
    for (x <- arr3) {
      print(x+" ")

  }


// Creating object


  // Main method

    var arr1 = Array(1, 2, 3, 4,0,0,0)
var arr10=arr1.filter(_ != 0)
    var arr2 = Array(5, 6, 7, 8,0,0)
var arr20=arr2.filter(_ != 0)
var newArr=1+:arr1
var a4=arr1 ++ 1


    var arr3 = concat(arr10, arr20).sorted

    // Print all the array elements
//    for (x <- arr3) {
//      println(x)
//    }
//

//////////////////////////


    val value = 20
implicit val io: Int = 10
//implicit val addition: Int = 5

    def add(implicit to: Int) = value + to

    val result = add
    println(result)
///////////////////////////////



