package algorithms.sort

import ninja.b1t.algorithms.sort.insertionSort
import kotlin.test.Test
import kotlin.test.assertEquals

class InsertionSortTest {

  @Test
  fun `Test InsertionSort unsorted`() {
    val list = arrayListOf(3, 2, 1)
    val expected = arrayListOf(1, 2, 3)
    list.insertionSort()

    assertEquals(expected, list)
  }

  @Test
  fun `Test InsertionSort empty`() {
    val list = arrayListOf<Int>()
    val expected = arrayListOf<Int>()
    list.insertionSort()

    assertEquals(expected, list)
  }

  @Test
  fun `Test InsertionSort sorted`() {
    val list = arrayListOf(1, 2, 3)
    val expected = arrayListOf(1, 2, 3)
    list.insertionSort()

    assertEquals(expected, list)
  }
}