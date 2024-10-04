package algorithms.search

fun <T> Collection<T>.linearSearch(target: T): Int? {
  this.forEachIndexed { index, t -> if (t == target) return index } // |-- 1
  return null // |-- 2
}

fun <T> Collection<T>.linearSearchLastOccurrence(target: T): Int? {
  var lastOccurrence: Int? = null
  this.forEachIndexed { index, t -> if (t == target) lastOccurrence = index}
  return lastOccurrence
}

fun <T> Collection<T>.linearSearchAllOccurrences(target: T): List<Int> =
  this.mapIndexedNotNull { index, t -> if (t == target) index else null }