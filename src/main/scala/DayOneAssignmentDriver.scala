package com.knoldus
import scala.util.Try

object DayOneAssignmentDriver extends App{
  // creating the objects for the classes
  val list = new ReplacementOfCharacters
  val list1 = new SquareRootOfNumbers
  val list2 = new KthElementfromLast

// perform the replacement of the character  function
  private val replacedCharacter = Try(list.replacementOfCharacters(List("My", "name", "is", "Michael", "Scott")))
  private val emptyListinreplaced = Try(list.replacementOfCharacters(List()))

  replacedCharacter match{
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
  emptyListinreplaced match {
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }

// perform the square root of the number function
  private val squared = Try(list1.squareRoot(List(4, 9, 16, 25)))
  private val emptyListinSquared = Try(list1.squareRoot(List()))

  squared match{
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }

  emptyListinSquared match{
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }

// perform the kthelement from the last end in the list
  private val positive = Try(list2.kthElement(2, List(2,3,4,5,6)))
  private val zero = Try(list2.kthElement(0, List(2,3,4,5,6)))
  private val negative = Try(list2.kthElement(-2, List(2,3,4,5,6)))
  private val emptyListinKth = Try(list2.kthElement(2, List()))

  positive match {
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
  zero match {
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
  negative match{
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
  emptyListinKth match {
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
}
