package ch01

object ch05 {
  def main(args: Array[String]): Unit = {
    val s = sum(1,4,9,16,25)
    println(s)

//    val s = sum(1 to 5) error
    val ss = sum(1 to 5:_*) // 인자 Seq
    println(ss)
  }

  def sum(args: Int*)={
    var result = 0
    for(arg <- args){
      result += arg
    }
    result
  }
}
