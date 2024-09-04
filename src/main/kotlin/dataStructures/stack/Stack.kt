package dataStructures.stack

import dataStructures.stack.StackImpl.Companion.create

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
    fun <T : Any> create(items: Iterable<T>) = StackImpl<T>().apply {
      items.forEach { push(it) }
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
  override fun pop() = storage.takeIf { it.isNotEmpty() }?.removeAt(storage.size - 1)

  override fun peek() = storage.lastOrNull()
}

// analogous to the listOf creation function, makes Stack more ergonomic
fun <T : Any> stackOf(vararg elements: T) = create(elements.asList())

fun <T: Any> emptyStackOf() = create(mutableListOf())