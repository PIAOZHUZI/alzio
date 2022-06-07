package ch10


object ch03 extends  App {

  val acct1 = new SavingsAccount
  acct1.withdraw(100)

  println("overdrawing acct2")
  val acct2 = new SavingsAccount with ConsoleLogger
  acct2.withdraw(100)

  trait ConsoleLogger extends Logged{
    override def log(msg : String): Unit = {
      println(msg)
    }
  }

  trait Logged{
    def log(msg : String) {}
  }

  class Account{
    protected var balance = 0.0
  }

  class SavingsAccount extends Account with Logged{
    def withdraw(amount : Double): Unit ={
      if(amount > balance) log("Insufficient funds")
      else balance -= amount

    }
  }

}
