object Solution {
  def solution(n: Int):Int = {
    var i: Long = 1
    var count = 0
    while(i * i < n) {
      // 24
      // i = 1,2,4,16(4回)
      if(n % i == 0) {
        // n/i = 24,12,8,6
        count += 2
        // i = 1,2,3,4
      }
      i += 1
    }
    if(i*i == n) {
      count + 1
    } else {
      count
    }
  }
}
// https://www.slideshare.net/chokudai/arc034 
Solution.solution(24)
