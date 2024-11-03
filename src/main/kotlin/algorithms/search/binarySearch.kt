package ninja.b1t.algorithms.search

fun <T : Comparable<T>> List<T>.binarySearch(element: T): Int? = doBinarySearch(this, element, 0, this.size - 1)

tailrec fun <T : Comparable<T>> doBinarySearch(haystack: List<T>, needle: T, left: Int, right: Int): Int? {
  if (left > right) return null

  val middle = left + (right - left) / 2
  val elem = haystack[middle]

  return when {
    elem == needle -> middle
    elem < needle -> doBinarySearch(haystack, needle, middle + 1, right)
    else -> doBinarySearch(haystack, needle, left, middle - 1)
  }
}