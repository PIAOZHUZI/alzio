package ch10_4

object ch02 extends App{

  try{
    val acct = new SavingsAccount
    acct.withdraw(100)
  }catch{
    case e : LoggedException => e.log()
  }

  trait Logged{
    def log(msg : String){}

  }

  trait ConsoleLogger extends Logged {
    override def log(msg: String): Unit = {
      println(msg)
    }
  }
  trait LoggedException extends Logged{
    this : {def getMessage() : String} =>
      def log(): Unit ={
        getMessage()
      }
  }



  class Account {
    protected var balance = 0.0

  }
  class SavingsAccount extends Account{
    def withdraw(amount: Double): Unit ={
      if(amount > balance) throw new IllegalStateException("Insufficient funds")
        with ConsoleLogger
      else balance -= amount
    }
  }
}
