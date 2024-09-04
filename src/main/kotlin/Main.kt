package ninja.b1t

import ninja.b1t.dataStructures.queue.queueOf

fun main() {
  val q = queueOf(1, 2, 3).dequeue()
  println(q)
}