package ch10

object ch02 extends App{

  val acct = new SavingsAccount

  acct.withdraw(100)


  trait ConsoleLogger{
    def log(msg : String): Unit = {
      println(msg)
    }
  }
  class Account {
    protected var balance = 0.0

  }
  class SavingsAccount extends Account with ConsoleLogger{
    def withdraw(amount : Double): Unit ={
      if(amount > balance) log("Insufficient funds")
      else balance -= amount
    }
  }
}
