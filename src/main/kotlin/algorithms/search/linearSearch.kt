package ninja.b1t.algorithms.search

fun <T: Comparable<T>> List<T>.linearSearch(needle: T) = asSequence().mapIndexed {index, elem -> if (elem == needle) index else null }.filterNotNull().firstOrNull()