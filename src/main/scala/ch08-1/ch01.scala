
//class Person (val name : String, val age : Int){
//  override def toString = getClass.getName() + "[ name = " +name +", age =" +age+ "]"
//}
//class Employee(name: String, age : Int, val salary : Double) extends Person(name, age){
//  override def toString: String = super.toString + "[ salary = "+salary+ " ]"
//}
//object ch01 extends App{
//
////  var d = new Employee("Fred",30,50000)
////  println(d.toString)
//    var d = new Square(50,150,150)
//    println(d)
//}
//class Square(x:Int , y:Int, width:Int) extends java.awt.Rectangle(x,y,width,width){
//
//}

class Person (val name : String){
  override def toString = getClass.getName() + "[ name = " +name + "]"
}
class SecretAgent(codename:String )extends Person(codename){
  override val name = "secret"
  override val toString = "secret"
}
object ch01 extends App{
//  val fed = new Person("fred")
//  println(fed.name)
//  val fed2 = new SecretAgent("007")
//  println(fed2.name)
val fed = new Student(456789)
println(fed.id)
  val fed2 = new SecretAgent2
  println(fed2.id)
}

abstract class Person2{
  def id : Int

}
class Student(override val id:Int) extends Person2
class SecretAgent2 extends Person2{
  override val id = scala.util.Random.nextInt
}