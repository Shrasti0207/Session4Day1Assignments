package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class ReplacementOfCharactersSpec extends AnyFunSuite{
  val testInputs = new ReplacementOfCharacters

  test("Test for Capitalize the letters"){
    val expected = List("My", "nAme", "is", "MichAel", "Scott")
    assert(testInputs.replacementOfCharacters(List("My", "name", "is", "Michael", "Scott")) === expected)
  }

  test(" Test for empty list which does not replace the characters") {
    val exception = intercept[IllegalArgumentException] {
      testInputs.replacementOfCharacters(List())
    }
    assert(exception.getMessage == "list is empty")
  }
}
