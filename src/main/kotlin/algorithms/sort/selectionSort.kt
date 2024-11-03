package ninja.b1t.algorithms.sort

import ninja.b1t.extensions.swapAt

fun <T : Comparable<T>> ArrayList<T>.selectionSort() {
  if (size < 2) return

  (0 until size - 1).forEach { index ->
    var smallestIndex = index

    (index + 1 until size).forEach { innerIndex ->
      if (this[innerIndex] < this[smallestIndex]) {
        smallestIndex = innerIndex
      }
    }

    swapAt(index, smallestIndex)
  }
}