package ch01

object ch06 {
  def main(args: Array[String]): Unit = { // 프로시저 값 리턴 없이 사이드 이펙트 호출
    box("Fred")
    //    val words = scala.io.Source.fromFile("").mkString
    //    def words = scala.io....Array[value](args)
    //    lazy val words = scala.io..;


  }

  def box(s: String): Unit = {
    val border = "-" * s.length + "--\n"
    println(border + "|" + s + "|\n" + border)
  }
}
