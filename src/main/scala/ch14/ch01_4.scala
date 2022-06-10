package ch14

object ch01_4 extends App{

  for( arr <- Array(Array(0),Array(1,0),Array(0,1,0),Array(1,1,0))){
    val result = arr match{
      case Array(0) => "0"
      case Array(x,y) => x + " " + y
      case Array(0,_*) => "0 ..."
      case _ => "something else"
    }
    println(result)
  }
  //::

  for (list <- Array(List(0) , List(1,0), List(0,0,0), List(1,0,0))){
    val result1 = list match {
      case 0 :: Nil => 0
      case x :: y :: Nil => x + " " + y
      case 0 :: tail => "0..."
      case _ => "something else"
    }
    println(result1)
  }

  for(pair <- Array((0,1) , (1,0), (1,1))){
    val result2 = pair match {
      case (0,_) => "0"
      case (y,0) => y+" 0"
      case _ => "neither is 0"
    }
    println(result2)
  }
}
