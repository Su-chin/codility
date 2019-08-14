/*
scalaぽく修正したい。
 */
object Solution {
  def solution (a: Array[Int]): Int = {
    var cnt = 0
    var east = 0
    var key = 0
    while (key < a.length) {
      if (0 == a(key)) {
        east += 1
      } else {
        cnt += east
        if (cnt > 1000000000) {
          return -1
        }
      }
      key += 1
    }
    cnt
  }
}

Solution.solution(Array(0,1,0,1,1))
