package net.joastbg.scalaproblems

import org.specs2.mutable._

class Problem7_Specs extends Specification with Problem7 {
  "the function flatten" should {
    "flatten a nested list structure" in {
      flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8)      
    }
  }
}