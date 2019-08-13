import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  /*
  whileを２重で使用してペアになる数を比較する
  比較し、ペアになりきれないものをresultに格納して出力する。
   */

  def solution(a: Array[Int]): Int = {
    val sortedArray = a.sorted
    var key = 0
    var result = 0

    while (key < sortedArray.length) {
      var number = sortedArray(key)
      var count  = 0
      while (key < sortedArray.length && sortedArray(key) == number) {
        key   += 1
        count += 1
      }
      if (count % 2 == 1) result = number
    }
    result
  }
}

Solution.solution(Array(9,3,9,3,9,7,9))
