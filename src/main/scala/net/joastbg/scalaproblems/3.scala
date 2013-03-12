package net.joastbg.scalaproblems

trait Problem3 {
  def nth[T](th:Int, l:List[T]):T = (th, l) match {
    case (0, h :: _) => h
    case (_, _ :: t) => nth(th-1, t)
    case (_, Nil)    => throw new NoSuchElementException
  }
}