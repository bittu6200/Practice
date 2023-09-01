import scala.collection.mutable

def countPairsWithSum(arr: Array[Int], targetSum: Int): Int = {
  var count = 0
  val arr = mutable.HashSet.empty[Int]

  for (num <- arr) {
    val complement = targetSum - num
    if (arr.contains(complement)) {
      count += 1
    }
    arr.add(num)
  }

  count
}

//1,2,3,4,5
//
// c={5-1}=2  , c=1  , count=0
//c=(5-2}=3  ,c=1,2  , count=0
//c={5-3}=2  c=1,2,3 , count=1

// Example usage:
val arr = Array(1, 2, 3, 4, 5, 6)
val targetSum = 7
val result = countPairsWithSum(arr, targetSum)
println(s"Number of pairs with sum $targetSum: $result")

//{1,2,3,4,5,6}
//i to 3 =p
//i+1 to 3+1

