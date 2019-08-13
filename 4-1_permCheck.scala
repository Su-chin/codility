object Solution {

  /*
  100%は出たがこれだと最後まで計算してしまうため、異常値を発見した際に離脱できるようなコードにしたほうが良い
  総和が合わなくなるので異常値がある方法もある
  */

  def solution (a: Array[Int]): Int = {
    val sortedArray = a.sorted
    var key = 0
    var result = 0

    while (key < sortedArray.length) {
      if (sortedArray(key) != key+1) {
        result = 1
      }
      key += 1
    }
    result
  }
}

Solution.solution(Array(4,1,3,2))
Solution.solution(Array(4,1,3))
