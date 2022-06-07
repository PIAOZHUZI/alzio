class Account (var balance : Double)

object ch04 extends App {

  val account = new Account(1000.0)
  val amount = 100.0
  account.synchronized({account.balance += amount})


  def printAny(x: Any){println(x)}
  def printUnit (x: Unit) {println(x)}
  printAny(("Hello"))
  printUnit("Hello")
//  printUnit("Hello") ->printUnit(()) 만 호출 하게됨 그래서 호출 값이 () 가 됨


}

