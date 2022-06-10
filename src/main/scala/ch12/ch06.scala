package ch12

object ch06 extends App{

//  def runInThread(block : () => Unit): Unit ={
//    new Thread{
//      override def run(): Unit = {
//        block()
//      }
//    }.start()
//  }
//  runInThread {
//    () => println("Hi") ;
//      Thread.sleep(1000);
//      println("Bye")
//  }
  def runInThread(block : => Unit): Unit ={
    new Thread{
      override def run(): Unit = {
        block
      }
    }.start()
  }
  runInThread {
      println("Hi") ;
      Thread.sleep(1000);
      println("Bye")
  }

  def until(condition : => Boolean)(block : => Unit): Unit ={
    if(!condition){
      block
      until(condition)(block)
    }
  }
  var x = 10
  until(x==0) {
    x -=1
    println(x)
  }
}
