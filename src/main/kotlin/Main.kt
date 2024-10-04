package ninja.b1t

import ninja.b1t.algorithms.search.findSecondSmallest

fun main() {
  val list = listOf(1, 2, 2, 3, 4, 5)
  println(list.findSecondSmallest())
}

fun swap(x: Int, y: Int) {
  var x = x
  var y = y

  x = x xor y
  y = x xor y
  x = x xor y
  println("x = $x, y = $y")
}