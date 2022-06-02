package ch02

import scala.collection.mutable.ArrayBuffer

object ch03 {
  def main(args: Array[String]): Unit = {

    val a = Array(2,3,5,7,11)
    val result = for(elem <- a) yield 2*elem


    for(elem <- a if elem % 2 == 0) yield 2 * elem

    val b = ArrayBuffer(1,-2,-3,4,-5)

    removeAllFirst(b)

  }

  def removeAllFirst(a: ArrayBuffer[Int]): Unit ={
    val indexes = for(i <- 0 until a.length if a(i) < 0)
    yield i
    for(j <- ( 1 until indexes.length).reverse){
      a.remove(indexes(j))
    }
  }

}
