package ninja.b1t.dataStructures.queue

import ninja.b1t.dataStructures.queue.QueueImpl.Companion.create

interface Queue<T : Any> {
  fun enqueue(element: T): Boolean
  fun dequeue(): T?
  val count: Int
    get
  val isEmpty: Boolean
    get() = count == 0
  fun peek(): T?
}

class QueueImpl<T : Any> : Queue<T> {

  // static class member that helps in the creation of Stack objet
  companion object {
    fun <T : Any> create(items: Iterable<T>) = QueueImpl<T>().apply {
      items.forEach { enqueue(it) }
    }
  }

  private val list = arrayListOf<T>()
  override val count: Int
    get() = list.size

  override fun peek() = list.firstOrNull()
  override fun enqueue(element: T) = list.add(element)
  override fun dequeue() = list.removeFirstOrNull()
}

fun <T : Any> queueOf(vararg elements: T) = create(elements.asList())

fun <T: Any> emptyStackOf() = create(mutableListOf())