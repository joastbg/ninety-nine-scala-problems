package net.joastbg.scalaproblems

trait Problem5 {
  def reverse[T](l:List[T]):List[T] = l match {
    case Nil          => Nil
    case head :: tail => reverse(tail) ::: List(head)
  } 
}