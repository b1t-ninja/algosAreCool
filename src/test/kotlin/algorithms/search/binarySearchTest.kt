package algorithms.search

import kotlin.test.Test
import kotlin.test.assertEquals

class BinarySearchTest {
  val list = listOf(1, 2, 3, 4, 5)

  @Test
  fun lastIndex() {
    val target = 5
    val actual = list.binarySearch(target)
    val expected = 4
    assertEquals(expected, actual)
  }

  @Test
  fun firstIndex() {
    val target = 1
    val actual = list.binarySearch(target)
    val expected = 0
    assertEquals(expected, actual)
  }

  @Test
  fun itemNotInList() {
    val target = -3
    val actual = list.binarySearch(target)
    val expected = null
    assertEquals(expected, actual)
  }

  @Test
  fun itemAppearsMultipleTimes() {
    val list = listOf(1, 2, 3, 2, 1)
    val target = 2
    val actual = list.binarySearch(target)
    val expected = 1
    assertEquals(expected, actual)
  }
}