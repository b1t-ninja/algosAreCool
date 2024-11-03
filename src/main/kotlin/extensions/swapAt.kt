package ninja.b1t.extensions

fun <T : Comparable<T>> ArrayList<T>.swapAt(i: Int, j: Int) {
  val temp = this[i]
  this[i] = this[j]
  this[j] = temp
}