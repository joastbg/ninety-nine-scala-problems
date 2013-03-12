package net.joastbg.scalaproblems

import org.specs2.mutable._

class Problem1_Specs extends Specification with Problem1 {
  "the function last" should {
    "return last element of list" in {
      val list = List(1, 1, 2, 3, 5, 8)
      last(list) === 8
      lastRec(list) === 8
    }   
  }
  "the function last recursive version" should {
    "return last element of list" in {
      val list = List(1, 1, 2, 3, 5, 8)
      lastRec(list) === 8
    }   
  }
}