package net.joastbg.scalaproblems

trait Problem6 {
  def isPalindrome[T](l:List[T]):Boolean = l == l.reverse
}