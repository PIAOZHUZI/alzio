package ch07.com.horstmann.collection

import ch07.com.horstmann.impatient.people.Person

object test {

}
object ch01 extends App{
  val fred = new Person("Fred")
  val fred2 = new Person("Fred2")
  val fred3 = new Person("Fred3")
  fred.friends+=fred2;
  fred.friends+=fred3;

  println(fred.desc)

}