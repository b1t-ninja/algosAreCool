package ninja.b1t.algorithms.search

fun <T: Comparable<T>> Collection<T>.findMaxIndex(): Int? {
  if (isEmpty()) return null

  return foldIndexed(0) { index, maxPos, value ->
    if (value > elementAt(maxPos)) index else maxPos
  }
}