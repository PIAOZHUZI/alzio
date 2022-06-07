package ch09_1

import scala.io.Source
import scala.io.StdIn.readInt

object ch01 extends App{
  val source = Source.fromFile("/Users/juhee/Documents/toy/alzio/src/main/scala/ch09_1/may.txt","UTF-8")
//  val iter = source.buffered
//
//  while(iter.hasNext){
//    print(readWord(iter))
//    if(iter.next == '\n'){
//      println()
//    }else{
//      print(',')
//    }
//  }
//  source.close()
//  def readWord(iter : BufferedIterator[Char])={
//
//    val builder = new StringBuilder
//    while(iter.hasNext && !Character.isWhitespace(iter.head)){
//      builder += iter.next()
//    }
//    builder
//  }

  //mk string

  val tokens = source.mkString.split("\\s+")
  val numbers = for(w<- tokens) yield w.toDouble
  println("sum : " + numbers.sum)
  val number2 = tokens.map(_.toDouble)
  println("sum : " + number2.sum)


  print("How old are you ? ")
  val age = readInt()
  println("next year, you will be " + (age+1))


}
