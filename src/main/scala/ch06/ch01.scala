package ch06

object ch01 { // class 의 단독 인스턴트 정의

  def main(args: Array[String]): Unit = {
//    println(Accounts.newUniqueNumber())
//    println(Accounts.newUniqueNumber())

    val acc1 = new Account
    val acc2 = new Account

    acc1.deposit(1000)
    println(acc1.descripton)
    println(acc2.descripton)
  }
}
class Account{
  var id = Accounts.newUniqueNumber()
  private var balance = 0.0
  def deposit (amount : Double): Unit = {
    balance += amount
  }
  def descripton = "Account " + id + "with balance " + balance
}
object Account{

}
object Accounts{ //class 의 모든 기능을 가질수 있음 예외가 생성자 인자를 줄수 없음
  private var lastNumber = 0
  def newUniqueNumber() = {
    lastNumber +=1;
    lastNumber
  }
}
abstract class UndoableAction(val description : String){
  def undo() : Unit
  def redo() : Unit

}
object DoNothingAction extends UndoableAction("Do noting"){
  override def undo(): Unit = {


  }

  override def redo(): Unit = {


  }
}



//val actions = Map("open" -> DoNotionAction, "save" -> DoNotionAction)
//actions("open").dscription
//actions("open") == actions("save")