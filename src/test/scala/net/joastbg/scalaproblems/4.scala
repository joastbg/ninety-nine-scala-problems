package net.joastbg.scalaproblems

import org.specs2.mutable._

class Problem4_Specs extends Specification with Problem4 {
  "the function length" should {
    "find the number of elements of a list" in {
      val list = List(1, 1, 2, 3, 5, 8)
      length(list) === 6
    }
  }
  "the function length2" should {
    "find the number of elements of a list" in {
      val list = List(1, 1, 2, 3, 5, 8)
      length2(list) === 6
    }
  }
}