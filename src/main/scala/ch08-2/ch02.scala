//abstract  class Person2(val name:String){
//  val id : Int
//  // def id:Int
//  var name : String
//
//  override def toString: String = getClass.getName + "[ id = " + id + "name = "+name + "]"
//}
//
abstract  class Person2{
  val id : Int
  // def id:Int
  var name : String

  override def toString: String = getClass.getName + "[ id = " + id + "name = "+name + "]"
}
//class Employee(name: String) extends Person(name){
//  def id = name.hashCode
//}

class Employee(val id : Int) extends Person2 {
  var name = ""
}

object ch02 extends App{
//  val fred = new Employee("Fred")
//  println(fred.id)
  var james = new Employee(7)
  var fred  = new Person2{
    val id = 1729
    var name = "Fred"
  }
  println(james)
  println(fred)
}
