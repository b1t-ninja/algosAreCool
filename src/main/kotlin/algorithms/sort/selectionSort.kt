package ninja.b1t.algorithms.sort

fun <T> MutableList<T>.swap(i: Int, j: Int) {
  val temp = this[i]
  this[i] = this[j]
  this[j] = temp
}

fun <T: Comparable<T>> MutableList<T>.selectionSort() = doSelectionSort(0)

// worker function
private tailrec fun <T: Comparable<T>> MutableList<T>.doSelectionSort(start: Int) {
  if (start >= size - 1) return  // |-- 1

  val minIndex = (start until size).minByOrNull { this[it] } ?: start // |-- 2

  if (minIndex != start) this.swap(start, minIndex) // |-- 3

  doSelectionSort(start + 1) // |-- 4
}