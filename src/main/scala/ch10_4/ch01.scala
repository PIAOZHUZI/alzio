package ch10_4

object ch01 extends App{

  try{
    val acct = new SavingsAccount
    acct.withdraw(100)
  }catch{
    case e : LoggedExcetion => e.log()
  }

  trait Logged{
    def log(msg : String){}

  }

  trait ConsoleLogger extends Logged {
    override def log(msg: String): Unit = {
      println(msg)
    }
  }
  trait LoggedExcetion extends Exception with Logged{
    def log(): Unit ={
      log(getMessage())
    }
  }
  class UnhappyException extends IllegalStateException with LoggedExcetion{
    override def getMessage(): String = "arggh!"
  }

  class Account {
    protected var balance = 0.0

  }

  class SavingsAccount extends Account{
    def withdraw(amount: Double): Unit ={
      if(amount > balance) throw new UnhappyException with ConsoleLogger
      else balance -= amount
    }
  }
}
