package ninja.b1t.datastructures

interface Stack<T : Any> {
  fun push(element: T): Boolean
  fun pop(): T?
  fun peek(): T?
  val count: Int
  val isEmpty: Boolean
    get() = count == 0
}

class StackImpl<T : Any> : Stack<T> {
  private val storage = arrayListOf<T>()

  override fun push(element: T) = storage.add(element)

  override fun pop(): T? {
    if (isEmpty)
      return null

    return storage.removeAt(storage.size - 1)
  }

  override fun peek() = storage.lastOrNull()

  override val count: Int
    get() = storage.size

  companion object {
    fun <T : Any> create(items: Iterable<T>): Stack<T> {
      val stack = StackImpl<T>()
      for (item in items) {
        stack.push(item)
      }
      return stack
    }
  }
}

fun <T : Any> stackOf(vararg elements: T): Stack<T> {
  return StackImpl.create(elements.asList())
}