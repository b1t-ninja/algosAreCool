package ninja.b1t.algorithms.sort

fun <T : Comparable<T>> MutableList<T>.insertionSort() = doInsertionSort(0)

private tailrec fun <T : Comparable<T>> MutableList<T>.doInsertionSort(start: Int) {
  if (start >= size - 1) return // |-- 1

  val current = this[start + 1] // |-- 2
  val insertionIndex = (0..start).findLast { this[it] <= current } ?: -1 // |-- 3

  (start downTo insertionIndex + 1).forEach { this[it + 1] = this[it] } // |-- 4
  this[insertionIndex + 1] = current // |-- 5

  doInsertionSort(start + 1) // |-- 6
}
