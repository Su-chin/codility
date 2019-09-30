import scala.collection.mutable
object Solution {
  def solution(a: Array[Int]): Int = {
    def getPeaks(blockSize: Int, peaks: mutable.ListBuffer[Int]) : Int = {
      var nPeaks: Int = 0
      for(peak <- peaks) {
        if(peak / blockSize > nPeaks) return nPeaks
        else if (peak / blockSize == nPeaks) {
          nPeaks += 1
        }
      }
      nPeaks
    }
    if (a.size < 3) return 0
    var peaks = mutable.ListBuffer[Int]()
    for(i <- 1 until a.length - 1) {
      if (a(i) > a(i - 1) && a(i) > a(i + 1)) peaks += i
    }

    if (peaks.size == 0) return 0

    for(nBlocks <- a.length until 1 by -1) {
      if(a.length % nBlocks == 0) {
        var blockSize: Int = a.length / nBlocks
        var nPeaks: Int = getPeaks(blockSize, peaks)

        if(nBlocks == nPeaks) return nBlocks
      }
    }
    1
  }
}
