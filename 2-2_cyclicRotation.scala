object Solution {
  def solution(n: Array[Int], k: Int): Array[Int] = {
    if (n.isEmpty) n
    else {
      val vector = n.toVector
      // 繰り返しが発生しないようにする
      val count = k % n.length
      (vector.takeRight(count) ++ vector.dropRight(count)).toArray
    }
  }
}

Solution.solution(Array(3, 8, 9, 7, 6), 3)
