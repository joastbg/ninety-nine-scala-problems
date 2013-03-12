package net.joastbg.scalaproblems

import org.specs2.mutable._

class Problem5_Specs extends Specification with Problem5 {
  "the function reverse" should {
    "reverse a list" in {
      val list = List(1, 1, 2, 3, 5, 8)
      reverse(list) === List(8, 5, 3, 2, 1, 1)
    }
  }
}