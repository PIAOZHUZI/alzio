package ch10_2

object ch01 extends App{

  val acct1 = new SavingsAccount with ConsoleLogger with ShortLogger{
    override val maxLength: Int = 15
  }
  acct1.withdraw(100)


  trait Logged{
    def log(msg: String){}
  }

  trait ConsoleLogger extends Logged{
    override def log(msg: String): Unit = {
      println(msg)
    }
  }
  trait ShortLogger extends Logged{
//    val maxLength = 15
      val maxLength :Int

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
    var interest = 0.0
    def withdraw(amount : Double): Unit ={
      if(amount > balance) log ("Insufficient funds")
      else balance -= amount
    }
  }
}
