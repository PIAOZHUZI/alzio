class Item(val description : String , val price : Double) {
  final override def equals(obj: Any) ={
    val that = obj.asInstanceOf[Item]
    if(that == null) false
    else description == that.description && price == that.price

  }

  final override def hashCode(): Int = 13 * description.hashCode + 17 * price.hashCode
}


object ch05 extends App {

  val item1 = new Item("Toaster", 29.95)
  val item2 = new Item("Toaster", 29.95)
  val item3 = new Item("Espresso machin", 199.95)

  println(item1 == item2)
  println(item1.equals(item2))
  println(item1 == item3)

}
