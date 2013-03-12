package net.joastbg.scalaproblems

import org.specs2.mutable._

class Problem6_Specs extends Specification with Problem6 {
  "the function palindrome" should {
    "find out whether a list is a palindrome" in {
      val list = List(1, 2, 3, 2, 1)
      isPalindrome(list) === true
    }
    "find out whether a list is not a palindrome" in {
      val list = List(1, 2, 3, 2, 2)
      isPalindrome(list) === false
    }
  }
}