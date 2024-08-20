import ninja.b1t.dataStructures.linkedList.Node

class LinkedList<T : Any> {
  private var head: Node<T>? = null
  private var tail: Node<T>? = null
  private var size = 0

  fun isEmpty(): Boolean = size == 0

  fun push(value: T): LinkedList<T> = apply {
    head = Node(value = value, next = head)
    if (tail == null) {
      tail = head
    }
    size++
  }

  fun append(value: T) {
    if (isEmpty()) {
      push(value)
      return
    }
    val newNode = Node(value = value)
    tail!!.next = newNode
    tail = newNode
    size++
  }

  fun nodeAt(index: Int): Node<T>? {
    var currentNode = head // |-- 1
    var currentIndex = 0 // |-- 2
    while (currentNode != null && currentIndex < index) {
      currentNode = currentNode.next
      currentIndex++
    }
    return currentNode
  }

  override fun toString(): String {
    if (isEmpty()) {
      return "Empty list"
    } else {
      return head.toString()
    }
  }
}