package ch13

object ch02 extends App {

  val immutableMap: collection.immutable.Map[String, Int] = Map("Hello" -> 42)

  val mutableMap = new collection.mutable.HashMap[String, Int]
  val map : collection.Map[String, Int] = mutableMap

  mutableMap.put("Wilma",17)
  mutableMap.put("Fred", 29)

//  map.put("Fred",29) 수정 불가능해서.. 에러남


  def digits(n : Int): Set[Int]=
    if( n < 0){
      digits(-n)
    }else if(n < 10 ){
      Set(n)
    }else {
      digits(n / 10) + (n%10)
    }

  println(digits(1729))


}

