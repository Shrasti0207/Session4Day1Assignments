package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class KthElementFromLastSpec extends AnyFunSuite {
  val testInput2 = new KthElementfromLast

  test("Test for finding kth from last") {
    val expected = 5
    assert(testInput2.kthElement(2, List(2, 3, 4, 5, 6)) === expected)
  }

  test(" Test for negative index") {
    val exception = intercept[NoSuchElementException] {
      testInput2.kthElement(-2, List(2, 3, 4, 5, 6))
    }
    assert(exception.getMessage == "invalid")
  }

  test(" Test for empty list when no elements in the list") {
    val exception = intercept[NoSuchElementException] {
      testInput2.kthElement(2, List())
    }
    assert(exception.getMessage == "list is empty")
  }
}
