package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class SquareRootOfNumbersSpec extends AnyFunSuite {
  val testInput3 = new SquareRootOfNumbers
  test("Test for finding the squareroot of the elements") {
    val expected = List(2, 3, 4, 5)
    assert(testInput3.squareRoot(List(4, 9, 16, 25)) === expected)
  }

  test("Test for empty list which give exception") {
    val exception = intercept[NoSuchElementException] {
      testInput3.squareRoot(List())
    }
    assert(exception.getMessage == "list is empty")
  }
}
