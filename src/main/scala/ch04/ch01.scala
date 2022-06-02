package ch04

object ch01 {

  def main(args: Array[String]): Unit = {
    val scores = Map("Alice" -> 10 , "Bob" -> 3, "Cindv" -> 8)//수정 불가
    val sc = scala.collection.Map("Alice" -> 10 , "Bob" -> 3, "Cindv" -> 8) // 수정 가능

//    val sc2 = new scala.collection.mutable.HashMap[String,Int]
//    val sc3 = Map(("Alice",10),("Bob",3))

    val bobsScore = scores("Bob")
    //scores.get("Bob")
    //키 있는지 확인하려면

    val fredsScore = if(scores.contains("Fred")) scores("Fred") else 0
    val bobsScore2 = scores.getOrElse("Bob",0)

    println(scores.get("Bob"))
    println(scores.get("Fred"))

//--------------------------------------------------
    val scores2 = scala.collection.mutable.Map("Alice" -> 10 , "Bob" -> 3, "Cindv" -> 8)

    scores2("Bob") = 10
    scores2("Fred") = 7
    //add
    scores2 += ("Bob"-> 10, "Fred" -> 7)
    //del
    scores2 -=("Alice")

    val scores3 = Map("Alice" -> 10, "Bob" -> 3, "Cindv"->8)
    val newScores = scores3 + ("Bob" -> 10, "Fred" -> 7)

    println((newScores))

    var scores4 = Map("Alice" -> 10, "Bob" -> 3, "Cindv"->8)
    scores4 = scores4 + ("Bob" -> 10, "Fred" -> 7)

    println(scores4)

    scores4  = scores4 - "Alice"
    println(scores4)


   // for((k,v) <- map) process k and v

    for((k,v) <- scores3) println(k + "is mapped to  " + v)

  //keySet
    scores3.keySet

    for(v<-scores3.values) println(v)

    for((k,v) <- scores3) yield (v,k)

    val scores5 = scala.collection.immutable.SortedMap("Alice" -> 10, "Fred"->7) // 수정 불가능
    //수정 하고 싶으면 자바 트리맵 개조



    val months = scala.collection.mutable.LinkedHashMap("Jar"->1)

  }

}
