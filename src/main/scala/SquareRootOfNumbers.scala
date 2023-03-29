package com.knoldus
import scala.math.sqrt

class SquareRootOfNumbers {
  //  squareRoot method which finds the squareRoot of the numbers
  def squareRoot(list: List[Int]): List[Int] = {
    if (list.isEmpty) throw new NoSuchElementException("list is empty")
    else list.map(x => sqrt(x).round.toInt)
  }
}
