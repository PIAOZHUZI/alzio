package ch13

object ch04 extends App{

  val digits = List(4,2) // Nil
  //:: 주어진 머리와 꼬리로 새로운 리스트 만듬
  println(9::List(4,2)) // 9,4,2 // 9::4::2::Nil


//  def sum(lst : List[Int] ): Int = {
//    if (lst == Nil) 0
//    else lst.head + sum(lst.tail)
//  }
//
//  println(sum(List(9,4,2)))

  def sum(lst : List[Int] ) : Int = lst match{
    case Nil => 0
    case h :: t => h + sum(t)
  }
  println(sum(List(9,4,2)))
  println(List(9,4,2).sum)
}
