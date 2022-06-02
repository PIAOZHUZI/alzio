package ch01

object ch04 {

  def main(args: Array[String]): Unit = {
    println(decorate("Hello"))
    println(decorate("Hello","<<<",">>>"))
    println(decorate("Hello",">>>>["))
    println(decorate(left = "<<<<", str = "Hello", right = ">>>>"))
    println(decorate("Hello",right="]<<<"))


  }

  def decorate(str : String, left: String ="[" , right : String="]") =
    left + str + right
}
