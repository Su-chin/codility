import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(n: Int): Int = {
    // 肯定的後読み(?<=1) 直前に１がある
    // 強欲な量指定子 0+ 繰り返せるだけ繰り返す
    // 肯定的先読み (?=1) 1と一致した直前まで 1を含まない
    // findAllIn パターンに一致したものを返す

    // 0000のみで構成されたSeqが作成される
    val numSeq = "(?<=1)0+(?=1)".r.findAllIn(n.toBinaryString).toList

    // maxBy 比較した最大要素を返す
    if (numSeq.isEmpty) 0
    else numSeq.maxBy(_.length).length
    // write your code in Scala 2.12
  }
}

var n = 1041
Solution.solution(n)

