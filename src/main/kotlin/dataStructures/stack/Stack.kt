package ninja.b1t.dataStructures.stack

interface Stack<T : Any> {
  fun push(element: T)
  fun pop(): T?
  fun peek(): T?
  val count: Int
  val isEmpty get() = count == 0
}

class StackImpl<T : Any> : Stack<T> {
  private val list = arrayListOf<T>()

  companion object {
    fun <T : Any> create(items: Iterable<T>): Stack<T> {
      val stack = StackImpl<T>()
      for (item in items) {
        stack.push(item)
      }
      return stack
    }
  }

  override fun push(element: T) {
    list.add(element)
  }

  override fun pop(): T? {
    if (list.isEmpty()) return null
    return list.removeAt(list.size - 1)
  }

  override fun peek(): T? {
    return list.lastOrNull()
  }

  override val count = list.size
}

fun <T : Any> stackOf(vararg elements: T): Stack<T> {
  return StackImpl.create(elements.asList())
}