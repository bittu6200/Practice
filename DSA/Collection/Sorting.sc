/* "Should understand the concept of Sorting
- Selection sort.
- Bubble sort.
- Insertion sort.
- Merge sort.
- Quick sort.
- Heap sort.
- Counting sort.
- Radix sort."
 */
///Selection sort/////
//selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest(or largest)
//and swap it with the first element of the unsorted part
// 64,25,12,22,11 (then find min element from 25,12,22,64) compare with 64 if small then swap that position
//* 11,25,12,22,64 (then find min element from 12,22,64) compare with 25 if small then swap that position
//*11,12,25,22,64 ( then find min element from 22,64 ) compare with 25
//11,12,22,25,64 ( then find min element from 64 ) compare with 25 no swap


//64,25,12,22,11



val a=Array(64, 25, 12, 22, 11)
for(i<-0 until a.length-1){
  print(a(i)+" ")
}