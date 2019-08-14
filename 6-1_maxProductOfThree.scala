/*
正数が３つ
or
正数が１つ and 負の数が２つ
負の整数が２つの場合は許容できる
 */

object Solution {
  def solution (a: Array[Int]): Int = {
    val sortedArray = a.sorted
    val pattern1 = sortedArray(sortedArray.length - 1) * sortedArray(sortedArray.length - 2) * sortedArray(sortedArray.length - 3)
    val pattern2 = sortedArray(0) * sortedArray(1) * sortedArray(sortedArray.length - 1)
    if (pattern1 > pattern2) {
      pattern1
    } else {
      pattern2
    }
  }

  def solution2 (a: Array[Int]): Int = {
    val sortedArray = a.sorted
    val end = sortedArray.length - 1
    Math.max(
      sortedArray(0) * sortedArray(1) * sortedArray(end),
      sortedArray(end - 2) * sortedArray(end - 1) * sortedArray(end)
    )
  }
}

Solution.solution2(Array(-3,1,2,-2,5,6))
