package ch10

object ch01 extends App {

  val logger = new ConsoleLogger
  logger.log("Exiting Main")
  trait Logger{
    def log(msg : String)
  }

  class ConsoleLogger extends Logger with Cloneable with Serializable{ // 하나 이상 with 으로 씀
    def log(msg:String): Unit ={
      println(msg)
    }
  }
}
