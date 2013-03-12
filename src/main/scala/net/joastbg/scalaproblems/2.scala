package net.joastbg.scalaproblems

trait Problem2 {
  def penultimate[T](l:List[T]):T = l match {
    case p :: last :: Nil => p
    case _ :: tail        => penultimate(tail)
    case _                => throw new NoSuchElementException
  }
}