// Scala program to
// push element
// to the stack

//top,push,pop
//import scala.collection.mutable.Stack

import scala.collection.mutable
import scala.collection.mutable.Stack

// Creating object


    var s = mutable.Stack[Int]()

    // pushing values
    // one at a time
    s.push(5)
    s.push(1)
    s.push(2)
    println("s:" + s)

    var s2 = mutable.Stack[Int]()

    // pushing multiple values
    s2.push(5, 1, 2)
    println("s2:" + s2)
var st=mutable.Stack(1,2,3,4,5,6)
st.push(10)
st.push(11)
st.top

println(st)


