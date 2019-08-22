object Solution {
  def solution(a: Array[Int]): Int = {
    if (a.size == 0) return -1
    var count = scala.collection.Map.empty[Int, Int]
    var index = 0
    a.foreach { value =>
      if (count.contains(value)) {
        var number = count.get(value).get + 1
        count = count + (value -> number)
        if (number > a.size/2 ) {
          //          println(count.toString)
          return index
        }
      } else {
        count = count + (value -> 1)
      }
      index += 1
    }
    -1
  }
}
// 91%
Solution.solution(Array(3,4,3,2,3,-1,3,3))
