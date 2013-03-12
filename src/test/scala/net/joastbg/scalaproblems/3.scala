package net.joastbg.scalaproblems

import org.specs2.mutable._

class Problem3_Specs extends Specification with Problem3 {
  "the function nth" should {
    "find the k:th element of a list" in {
      val list = List(1, 1, 2, 3, 5, 8)
      nth(2, list) === 2
    }
  }
}