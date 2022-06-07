package ch10

object ch04 extends App {
  val acc1 = new SavingsAccount with ConsoleLogger with TimeStampLogger with ShortLogger
  val acc2 = new SavingsAccount with ConsoleLogger with ShortLogger with TimeStampLogger

  acc1.withdraw(100)
  acc2.withdraw(100)

  trait Logged {
    def log(msg : String){}
  }
  trait ConsoleLogger extends Logged{
    override def log(msg: String): Unit= {
      println(msg)
    }
  }
  trait TimeStampLogger extends Logged{
    override def log(msg: String): Unit = {
      super.log(new java.util.Date() + " " +msg)
    }
  }
  trait ShortLogger extends Logged{
    val maxLength = 15
    override def log(msg: String): Unit = {
      super.log(
        if(msg.length() <= maxLength) msg else msg.substring(0,maxLength-3) + "...."
      )
    }
  }
  class Account {
    protected var balance = 0.0
  }

  class SavingsAccount extends Account with Logged{
    def withdraw(amount : Double): Unit ={
      if(amount > balance) log("Insufficient funds")
      else balance -= amount
    }
  }
}
