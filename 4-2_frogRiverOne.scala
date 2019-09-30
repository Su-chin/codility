object Solution {
  def solution(x: Int, a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val array = a.toSet.toArray
    var res = 0
    if (array.length != x) {
      res = -1
    } else {
      res = array.indexOf(a, array(array.length-1))
    }
    res
  }
}

Solution.solution(6, Array(1,3,1,4,2,3,5,4))
//Solution.solution(Array(4,1,3))
