package algorithms.sort

import ninja.b1t.algorithms.sort.selectionSort
import kotlin.test.Test
import kotlin.test.assertEquals

class SelectionSortTest {
  @Test
  fun `SelectionSort test unsorted`() {
    val list = arrayListOf(3, 2, 1)
    val expected = arrayListOf(1, 2, 3)
    list.selectionSort()

    assertEquals(expected, list)
  }

  @Test
  fun `SelectionSort test empty`() {
    val list = arrayListOf<Int>()
    val expected = arrayListOf<Int>()
    list.selectionSort()

    assertEquals(expected, list)
  }

  @Test
  fun `SelectionSort test sorted`() {
    val list = arrayListOf(1, 2, 3)
    val expected = arrayListOf(1, 2, 3)
    list.selectionSort()

    assertEquals(expected, list)
  }
}