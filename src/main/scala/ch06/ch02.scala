package ch06

object ch02 {
  def main(args: Array[String]): Unit = {
//    Array.apply("Mary", "had", "a" , "little", "lamb")
//    Array(Array(1,7),Array(2,9))
//    Array(100) //Array[Int]
//    new Array(100) // this(100)Array[Nothin]

    val acct = Account2(1000.0)
    val d =acct.descrition;
    println(d)

  }
}
class Account2 private(val id: Int, initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double): Unit = {
    balance +=amount

  }
  def descrition = "Account " + id + " with balance  " + balance
}

object Account2 {
  def apply(initialBalance : Double) ={
    new Account2(newUniqueNumber(),initialBalance);
  }
  private var lastNumber = 0
  private def newUniqueNumber() ={
    lastNumber += 1;
    lastNumber
  }
}