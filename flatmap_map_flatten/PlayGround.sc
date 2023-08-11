

val list=List(1,2,3,4,5,6,7,8)


val list1=List(List(1,2,3),List(4,6,8))

//-----Map--------//
val f =(y:Int)=>y
val map=list.map(f)
//val map=list.flatMap() : wrong flatmap is not used here
//----------------------------------------
val f1=(y:List[Int])=>y
val map1=list1.map(f1)
//--------------------------------
//-------flatten---------//
val map1=list1.map(f1).flatten

//.......flatMap---------//
val map1=list1.flatMap(f1)

//----------------------------------------------------

val listOfString=List("Bittu","Raju","Deepak")

val p=(y:String)=>y
val map=listOfString.map(p)

val listOfListString2=List(List("Bittu","Raju","Deepak"),List("rahim"))

val f=(y:List[String])=>y

val map2=listOfListString2.map(f)

val map3=listOfListString2.map(f).flatten
// val map=list.flatMap  it gave us wrong
val map=listOfListString2.flatten

val map5=listOfListString2.flatMap(f)

//---------------------------------------------//




