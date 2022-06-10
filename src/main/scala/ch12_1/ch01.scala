package ch12_1

object ch01 extends App{
  def valueAtOneQuarter(f: (Double)=> Double) = f(0.25)
  valueAtOneQuarter((x : Double)=> 3* x)
  valueAtOneQuarter((x) => 3*x)
  valueAtOneQuarter(x=> 3*x)
  valueAtOneQuarter(3*_)

  //val fun = 3 * _ // error
  val fun = 3*(_:Double)
  val fun2: (Double) => Double = 3*_


  //(1 to 9).map(0.1 * _)
  (1 to 9).map("*" * _).foreach(println _)
  (1 to 9).filter(_%2 ==0).foreach(println _)

  val a =  (1 to 9).reduceLeft(_*_)
  println(a) // (...((1*2)*3)...*9)

  "Mary had a little lamb".split(" ").sortWith(_.length < _.length).foreach(println _ )


}
