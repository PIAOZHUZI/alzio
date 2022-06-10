package ch14_1

object ch06 extends App{

//  val scores = Map("Alice"-> 1729, "Fred" -> 42)
  val scores = Map("Fred" -> 42)

  scores.get("Alice") match {
    case Some(score) => println(score)
    case None => println("No score")
  }

  val alicesScore = scores.get("Alice")
  if(alicesScore.isEmpty){
    println("No Score")
  }else{
    println(alicesScore.get)
  }

  println(alicesScore.getOrElse("No Score"))

  println(scores.getOrElse("Alice", "No score")) // None -> No score

  for (score <- scores.get("Alice")) println(score)

  scores.get("Alice").foreach(println _)
}
