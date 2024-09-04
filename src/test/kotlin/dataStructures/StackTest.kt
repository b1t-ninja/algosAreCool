package dataStructures

import dataStructures.stack.stackOf
import ninja.b1t.dataStructures.stack.isValidParenthesis
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StackTest {
  var stack = stackOf(1, 2, 3, 4, 5)

  @Test
  fun canPop() {
    assert(stack.pop() == 5)
  }

  @Test
  fun canPush() {
    stack.push(6)
    assert(stack.pop() == 6)
  }

  @Test
  fun canPeek() {
    stack.push(6)
    assert(stack.peek() == 6)
  }

  @Test
  fun canIsEmpty() {
    assertFalse(stack.isEmpty)
  }

  @Test
  fun isValidParen() {
    assertTrue(isValidParenthesis(""))
    assertTrue(isValidParenthesis("()"))
    assertTrue(isValidParenthesis("()()()"))
  }

  @Test
  fun isInvalidParen() {
    assertFalse(isValidParenthesis(")("))
    assertFalse(isValidParenthesis("(("))
  }
}