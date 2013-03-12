package net.joastbg.scalaproblems

import org.specs2.mutable._

class Problem2_Specs extends Specification with Problem2 {
  "the function penultimate" should {
    "find the last but one element of a list" in {
      val list = List(1, 1, 2, 3, 5, 8)
      penultimate(list) === 5    
    }
  }
}