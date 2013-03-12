package net.joastbg.scalaproblems

trait Problem1 {
  def last[T](l:List[T]) = l.last

  def lastRec[T](l:List[T]):T = l match {
    case last :: Nil  => last
    case _ :: tail    => lastRec(tail)
    case _            => throw new NoSuchElementException
  }
}