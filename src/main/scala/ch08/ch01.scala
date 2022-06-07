package ch08

class Person{
  var name = ""
  protected [this] var age = 0
  def setAge(newAge : Int): Unit ={
    if(newAge < age) {
      age = newAge
    }
  }
  override def toString = getClass.getName() + " [name =" + name + " ]"
}
class Employee extends Person{
  var salary = 0.0
  def desc = "An employee with name " + name + "and salary " + salary

  override def toString = super.toString+ "[ salary " + salary + " ]"
}

class Manager extends Employee{
//  protected var salary = 0.0
}
object ch01 extends App{
  val r = scala.math.random()
  val p = if( r < 0.33) new Person
  else if(r < 0.67) new Employee
  else new Manager

  if(p.isInstanceOf[Employee]){
    val s = p.asInstanceOf[Employee]
    println("It's an employee")
    s.salary = 5000
    if(p.getClass() == classOf[Manager]){
      println("Actually, It's a manager")
      s.salary *=2
    }
  }
  println(p)
//  val fred = new Emp loyee
//  fred.name = "fred"
//  fred.salary = 50000
//  println(fred.desc)
//  println(fred)
}
