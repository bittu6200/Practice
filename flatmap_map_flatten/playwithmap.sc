// Applying flatMap
//val result = portal.flatMap(_.toUpperCase)


var list = List(List(2, 3, 4),List(9,45,6))

//var list = List(List(9),List(60))

val list1=List(1,2,3,4)
val name=List("chandra","bittu")
val fn=(y:String)=>List(y)

val f=(y:Int)=>List(y)
val f1=(y:Int)=>y  //1,2,3,4

//val map1=list.map(x=>x)

val map=name.flatten
val map =name.map(fn).flatten

val fm1=List(1,2,3,4)

val f2=(y:List[Int])=>y

val f2s=(y:List[Int])=>y.sum  //list(9,60)  //List(2, 3, 4).sum,List(9,45,6).sum

val sumofsublist=list.map(f2s)

val mp=list1.map(f1).sum

//val mp1=list.m

val map=list.flatMap(f2).sum
//val map=list.map(f2).flatten

//
val fy=(y:Int)=>List(y)
//val fmap=list.flatMap(fy)
//
//val ftn=list.flatten(fy)


// Defining a function
def f(x:Int) = List(x-1, x, x+1)

// Applying flatMap
//val result = list.flatMap(y => f(y))

// List(1,2,3,2,3,4,3,4,5)




val seq = Seq(4, 5, 6, 7)

// Applying flatMap on another
// function
