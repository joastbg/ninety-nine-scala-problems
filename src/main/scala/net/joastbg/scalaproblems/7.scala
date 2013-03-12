package net.joastbg.scalaproblems

trait Problem7 {
  def flatten(l:List[Any]):List[Any] = l flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }
}