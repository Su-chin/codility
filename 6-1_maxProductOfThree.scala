object Solution {
  def solution (a: Array[Int]): Int = {
    val sortedArray = a.sorted
    sortedArray(sortedArray.length) * sortedArray(sortedArray.length - 1) * sortedArray(sortedArray.length - 2)
  }
}

Solution.solution(Array(-3,1,2,-2,5,6))
