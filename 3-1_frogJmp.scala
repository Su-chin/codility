
object Solution {
  def solution(x: Int, y: Int, d: Int): Int = {
    val distinct = y - x
    var jump_num = distinct / d
    if (distinct % d != 0) jump_num += 1
    jump_num
  }
}

Solution.solution(10, 85, 30)

