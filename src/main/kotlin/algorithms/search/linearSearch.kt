package ninja.b1t.algorithms.search

fun <T> Collection<T>.linearSearch(target: T): Int? {
  this.forEachIndexed { index, t -> if (t == target) return index }
  return null
}