package algorithms.search

fun <T: Comparable<T>> Collection<T>.binarySearch(target: T) = doBinarySearch(this, target, this.size - 1, 0)

// worker function
// assumes *ascending* order
private tailrec fun <T: Comparable<T>> doBinarySearch(collection: Collection<T>, target: T, high: Int, low: Int): Int? {
  if (low > high) return null // |-- 1

  val middle = (low + high) / 2
  val middleValue = collection.elementAt(middle)
  return when { // |-- 2
    target == middleValue -> middle // |-- 2a
    target < middleValue -> doBinarySearch(collection, target, middle - 1, low) // |-- 2b
    target > middleValue -> doBinarySearch(collection, target, high, middle + 1) // |-- 2c
    else -> null // |-- 2d
  }
}

tailrec fun <T: Comparable<T>> binarySearchPrint(collection: Collection<T>, target: T, low: Int, high: Int) {
  if (low > high) return
  val middle = (low + high) / 2
  val middleValue = collection.elementAt(middle)
  println(middleValue)

  return when {
    target == middleValue -> {}
    target < middleValue -> binarySearchPrint(collection, target, low, middle - 1)
    target > middleValue -> binarySearchPrint(collection, target, middle + 1, high)
    else -> {}
  }
}