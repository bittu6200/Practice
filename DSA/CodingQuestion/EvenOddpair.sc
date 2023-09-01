

val n=7
val (even,odd)=(1 to n).partition(_ %2 == 0)


even
odd

def evenOddPair(value:Int):(Int,Int)={
  if(value %2==0){
    (value,value+1)
  }else{
    (value-1,value)
  }
}
var value=7
while(value>0) {
  evenOddPair(value)
  value=value-1;
}


