package ch10_1

object ch01 extends App{

  val acct1 = new SavingsAccount
  acct1.withdraw(100)


  trait Logger{
    def log(msg : String)
    def info(msg : String): Unit = {
      log("INFO : "+ msg)
    }
    def warn(msg : String): Unit ={
      log("WARN " + msg)
    }
    def severe(msg : String): Unit ={
      log("SEVERE "+ msg)
    }
  }

  class Account {
    protected var balance = 0.0
  }
  class SavingsAccount extends Account with Logger{
    def withdraw(amount : Double): Unit ={
      if( amount > balance ) severe("Insufficient funds")
      else balance -= amount
    }

    override def log(msg: String): Unit = {
      println(msg)
    }
  }


//  trait TimestampLogger extends Logger{
//    abstract override def log(msg: String) = {
//      super.log((new java.util.Date()) + " " +msg)
//    }
//  }
}
