package ch09

import scala.io.Source

object ch01 extends App {

  val source = Source.fromFile("/Users/juhee/Documents/toy/alzio/src/main/scala/ch09/may.txt","UTF-8");
  val lineIterator = source.getLines

  for(l <-lineIterator){
    println(
      if(l.length<= 13) l
      else l.substring(0,10) + "... "
    )
  }
  source.close();
}
