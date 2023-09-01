import scala.collection.mutable
import scala.language.postfixOps
//abcabcdb


def maxLengthofSubString(str:String): Int = {
  var start=0
  var maxLength=0
  val charIndexMap=mutable.Map[Char,Int]();
  for(end<-0 until(str.length)){
    if(charIndexMap.contains(str(end)) && charIndexMap(str(end))+1>=start) {
      start=charIndexMap(str(end))+1
    }
    charIndexMap(str(end))=end
    maxLength=maxLength.max(end-start+1)

  }
maxLength
}