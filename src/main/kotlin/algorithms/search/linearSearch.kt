package algorithms.search

fun <T> Collection<T>.linearSearch(target: T): Int? {
  this.forEachIndexed { index, t -> if (t == target) return index } // |-- 1
  return null // |-- 2
}