package ch13_1

object ch02 extends App{

  val names = List("Peter","Paul","Mary")

  println(names.map(_.toUpperCase))
  //for (n <- names) yield n.toUpperCase()

  def ulcase(s:String) =Vector(s.toUpperCase(), s.toLowerCase())

  println(names.map(ulcase))

  println(names.flatMap(ulcase))

  println(
    "-3+4".collect{
      case '+' => 1;
      case '-' => -1
    }
  )

  names.foreach(println)


  println(List(1,7,2,9).reduceLeft(_-_)) // (((1-7)-2)-9)

  println(List(1,7,2,9).reduceRight(_-_)) // 1-(7-(2-9))

  println(List(1,7,2,9).foldLeft(0)(_-_))
  // 0 -1 -7 -2 -9
  println(List(1,7,2,9).foldLeft("")(_+_))

  //(0 /: List(1,7,2,9))(_-_) /:  더이상 사용 되지 않음

  val freq = scala.collection.mutable.Map[Char,Int]()
  for(c <- "Mississippi") freq(c) = freq.getOrElse(c,0) +1
  // i -> 4, M-> 1, s->4 , p->2

  println((1 to 10).scanLeft(0)(_+_))

}
