package ninja.b1t.algorithms.search

fun <T: Comparable<T>> Collection<T>.binarySearch(target: T) = doBinarySearch(this, target, this.size - 1, 0)

// worker function
// assumes *ascending* order
tailrec fun <T: Comparable<T>> doBinarySearch(collection: Collection<T>, target: T, high: Int, low: Int): Int? {
  if (low > high) return null

  val middle = (low + high) / 2
  val middleValue = collection.elementAt(middle)
  return when {
    target == middleValue -> middle
    target < middleValue -> doBinarySearch(collection, target, middle - 1, low)
    target > middleValue -> doBinarySearch(collection, target, high, middle + 1)
    else -> null
  }
}