

class Creature {
  val range : Int = 10
  val env : Array[Int] = new Array[Int](range)
}

class Ant extends Creature{
  override val range = 2
}
class Bug extends {
  override val range = 3
} with Creature // 조기 정의

object ch03 extends App {

  val a = new Ant
  println(a.range)
  println(a.env.length)

  val b = new Bug
  println(b.range)
  println(b.env.length)
}
