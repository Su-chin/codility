object Solution {

  // 60%
  def solution (a: Array[Int]): Int = {
    var key = 0
    var result = 0
    while (key < a.length) {
      var anotherKey = key+1
      if(a(key) == 0) {
        while (anotherKey < a.length) {
          var count = 0
          if (a(anotherKey) == 1) {
            count += 1
          }
          anotherKey += 1
          //          println(s"${key}, ${anotherKey}")
          result += count
        }
      }
      key += 1
    }
    result
  }
}

Solution.solution(Array(0,1,0,1,1))
