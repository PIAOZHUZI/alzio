package ch12_3

object ch01 extends App {

  def until(condition : => Boolean)(block : => Unit): Unit ={
    if(!condition){
      block
      until(condition)(block)
    }
  }

  def indexOf(str : String, ch :Char) : Int = {
    var i = 0
    until( i == str.length){
      if(str(i) == ch)
        return i
      i+=1
    }
    -1
  }

  println(indexOf("Hello",'l'))
  println(indexOf("Hello",'!'))
}
