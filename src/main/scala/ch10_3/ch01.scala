package ch10_3

import java.io.PrintStream

object ch01 extends App{

//  val acct = new {
//        val filename = "myapp.log"
//
//  }with SavingAccount with FileLogger

  val acct = new SavingAccount with FileLogger {
    val filename = "myapp2.log"
  }

  acct.withdraw(100)


  trait Logger {
    def log(msg: String)
  }
  trait FileLogger extends Logger{
    val filename: String
    lazy val out = new PrintStream("./src/main/scala/ch10_3/"+filename)
//    val out = new PrintWriteriter("./src/main/scala/ch10_3/"+filename)
    def log(msg : String): Unit = {
      out.println(msg);
      out.flush;
    }
  }

  class Account {
    println("Constructing Account")
    protected var balance = 0.0

  }

 abstract class SavingAccount extends Account with FileLogger{
    def withdraw(amount : Double): Unit ={
      if(amount > balance)
        log("Insufficient funds")
      else balance -= amount
    }
  }
}
