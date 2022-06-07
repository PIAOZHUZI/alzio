
class Person(val name:String){
  override def toString = getClass.getName + "[name = " + name + " ]"
}

object ch01 extends App{
  val alien = new Person("Fred"){
    def greeting = "Greetings, Earthling! My name is Fred. "
  }


  def meet(p: Person{def greeting : String}): Unit ={
    println(p.name + " says: "+ p.greeting)
  }

  meet(alien)
}
