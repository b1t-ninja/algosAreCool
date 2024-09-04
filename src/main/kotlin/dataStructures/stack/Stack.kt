package dataStructures.stack

interface Stack<T : Any> {
  fun push(element: T)
  fun pop(): T?
  fun peek(): T?
  val count: Int
  val isEmpty: Boolean
    get() = count == 0
}

class StackImpl<T: Any> : Stack<T> {

  // static class member that helps in the creation of Stack objet
  companion object {
    fun <T : Any> create(items: Iterable<T>): Stack<T> {
      val stack = StackImpl<T>()
      for (item in items) {
        stack.push(item)
      }
      return stack
    }
  }

  private val storage = arrayListOf<T>()
  override val count: Int
    get() = storage.size

  override fun toString() = buildString { storage.reversed().forEach { appendLine(it) } }

  override fun push(element: T) {
    storage.add(element)
  }

  // if storage is not empty, remove and return the last element of storage, else return null
  override fun pop() = storage.takeIf { it.isNotEmpty() }?.removeAt(0)

  override fun peek() = storage.lastOrNull()

  // analogous to the listOf creation function, makes Stack more ergonomic
  fun <T : Any> stackOf(vararg elements: T) = create(elements.asList())
}