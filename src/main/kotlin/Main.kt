package ninja.b1t

fun main() {
  val fibbonacci = buildList {
    addAll(listOf(1, 1, 2))
    add(3)
    add(index = 0, element = 3)
  }

  println(fibbonacci)
}