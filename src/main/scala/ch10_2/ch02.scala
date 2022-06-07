package ch10_2

import java.io.PrintWriter
import java.util.Date

object ch02 extends App {

  val acct = new SavingAccount
  acct.withdraw(100)
  println("Look into myapp.log for the log message.")

  trait Logger {
    println("Constructing Logger")
    def log(msg: String)
  }
  trait FileLogger extends Logger{
    println("Constructing FileLogger")
    val out = new PrintWriter("app.log")
    out.println("#" + new Date().toString)
    out.flush()
    def log(msg : String): Unit = {
      out.println(msg);
      out.flush;

    }
  }
  trait ShortLogger extends Logger{
    println("Constructing ShortLogger")
    val maxLength : Int
    abstract override def log(msg : String): Unit ={
      super.log(
        if(msg.length() <= maxLength) msg
        else msg.substring(0, maxLength-3)
      )
    }
  }

  class Account {
    println("Constructing Account")
    protected var balance = 0.0

  }

  class SavingAccount extends Account with FileLogger with ShortLogger{
    println("Construction SavingsAccount")
    val maxLength = 15
    def withdraw(amount : Double): Unit ={
      if(amount > balance)
        log("Insufficient funds")
      else balance -= amount
    }
  }

}

