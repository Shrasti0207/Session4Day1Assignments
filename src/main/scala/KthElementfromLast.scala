package com.knoldus
import scala.annotation.tailrec

class KthElementfromLast {
  // kthElement method which find the kth element from the end of the list
  def kthElement[T](k: Int, list1: List[T]): T = {
    val reverseList = list1.reverse
    @tailrec
    def kth(k: Int, reverseList: List[T]): T = {
      reverseList match {
        case Nil => throw new NoSuchElementException("list is empty")
        case reverseListHead :: _ if k == 1 => reverseListHead
        case _ :: reverseListTail if k > 1 => kth(k - 1, reverseListTail)
        case _ => throw new NoSuchElementException("invalid")
      }
    }
    kth(k, reverseList)
  }
}
