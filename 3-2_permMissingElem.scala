object Solution {
  def solution(a: Array[Int]): Int = {
    // 80%
    val n = a.length + 1
    val rightSum = 0.5 * n * (n + 1)
    rightSum.toInt - a.sum
  }

  // 100%
  def solution2(a: Array[Int]): Int = {
    val rightSum = (1 to a.length + 1).sum
    val sum = a.sum

    rightSum - sum
  }
}

Solution.solution(Array(2, 3, 1, 5))
