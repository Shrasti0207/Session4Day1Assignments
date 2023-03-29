package com.knoldus

class ReplacementOfCharacters {
  // replacementOfCharacters method which replace the characters in the string
  def replacementOfCharacters(list: List[String]): List[String]={
    if(list.isEmpty) throw new IllegalArgumentException("list is empty")
    else list.map(x => if (x.contains('a')) x.replace('a', 'A') else x)
  }
}
