object Solution {
  def solution(a: Array[Int]): Int = {
    // a,bに挟まれた数の合計 + b,c,に挟まれた数の合計

    // fill 同じ値で埋めるArray(0,0,0,0,0...,0) また まとめて初期化する意味もある
    val left  = Array.fill(a.length)(0)
    val right = Array.fill(a.length)(0)
    var count = 0

    // スタートからbまでの値
    for(i <- 1 until (left.length - 1)){
      left(i) = math.max(0,left(i - 1) + a(i))
      println(left(i))
    }
    // left(1) = 2
    // left(2) = 8
    // left(3) = 7
    // left(4) = 11
    // left(5) = 16
    // left(6) = 15

    //cからスタートまで
    // untilに２つの引数を渡すと一つの目の引数から２つ目の引数ずつ加算されて目的に向かう
    // マイナスになったらマイナス値を取らない
    for(i <- (right.length - 2) until (0, -1)){
      right(i) = math.max(0, right(i + 1) + a(i))
    }
    // right(6) = 0
    // right(5) = 5
    // right(4) = 9
    // right(3) = 8
    // right(2) = 14
    // right(1) = 16

    (1 until (a.length - 1)).map {i =>
      left(i - 1) + right(i + 1)
    }.max
  }
}

Solution.solution(Array(3,2,6,-1,4,5,-1,2))
