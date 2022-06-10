package ch14_1

abstract class Item
case class Article(des : String, price: Double) extends Item
case class Bundle (des: String, discount : Double, items: Item*) extends Item


object ch02_1 extends App{

  /**
   * abstract class List
   * case object Nil extends List
   * case class :: (head: Any , tail: List) extends List
   *
   */
  val special = Bundle("Father's day special", 20.0,
    Article("Scala for the Impatient", 39.95),
    Bundle("Anchor Distillery Sampler", 10.0,
    Article("Old potreto Straight Rye Whiskey",79.95),
    Article("Junipero GIn", 32.95)))

  special match{
    case Bundle(_,_, Article(descr, _), _*)=>println(descr)
  }
  special match{
    case Bundle(_,_, art @ Article(_,_), rest @ _*) => println((art,rest))
  }

  special match {
    case Bundle(_, _, art @ Article(_,_),  rest ) => println(art, rest)
  }

  def price(it: Item) : Double = it match{
    case Article(_, p) => p
    case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
  }
  val i = price(special)
  println(i)
  
}
