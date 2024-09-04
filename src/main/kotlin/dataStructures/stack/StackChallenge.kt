package ninja.b1t.dataStructures.stack

import dataStructures.stack.emptyStackOf

/*
A function to determine if a string has valid parenthesis, as in:
- (())() is valid
- (())( is invalid
 */
fun isValidParenthesis(input: String) =
  input.fold(emptyStackOf<Char>()) { acc, c ->
  when (c) {
    '(' -> acc.apply { push(c) }
    ')' -> if (!acc.isEmpty) acc.apply { pop() } else return false
    else -> acc
  }
}.isEmpty