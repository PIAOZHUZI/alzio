package ch05

object ch02 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person()
    val p2 = new Person("Alzio")
    val p3 = new Person("Alzio", 28)

    println(p1.description)
    println(p2.description)
    println(p3.description)

    val p12 = new Person2()
    val p22 = new Person2("Alzio")
    val p32 = new Person2("Alzio", 28)
    println(p12.description)
    println(p22.description)
    println(p32.description)
//    p32.name
//    p32.age
//    p32.description

  }
}
class Person{
  private var name = ""
  private var age = 0
  def this(name : String){ // 보조생성자
    this() //기본생성자
    this.name = name
  }
  def this(name : String, age : Int){
    this(name) // 먼저 생성된걸 호출
    this.age = age
  }
  def description = name +"is " + age + "years old"
}

class Person2(val name: String ="", private val age : Int = 0){
  println("Person2")
  def description = name + "is " + age + " years old"

}