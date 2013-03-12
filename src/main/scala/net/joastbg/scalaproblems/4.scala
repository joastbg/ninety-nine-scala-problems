package net.joastbg.scalaproblems

trait Problem4 {
  def length[T](l:List[T], len:Int = 0):Int = l match {
    case Nil    => len
    case h :: t => length(t, len+1)
  }

  def length2[T](l:List[T]):Int = l match {
    case Nil        => 0
    case _ :: tail  => 1 + length2(tail)
  }
}