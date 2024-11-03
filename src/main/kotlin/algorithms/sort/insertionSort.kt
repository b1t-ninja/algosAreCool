package ninja.b1t.algorithms.sort

import ninja.b1t.extensions.swapAt

fun <T : Comparable<T>> ArrayList<T>.insertionSort() {
  if (size < 2) return

  (1 until size).forEach { index ->
    val key = this[index]
    var position = index

    while (position > 0 && this[position - 1] > key) {
      swapAt(position, position - 1)
      position -= 1
    }
  }
}