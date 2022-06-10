package ch11_3

//object ch01 extends App {
//
//  val author =  "alzio van def Capture"
//  author match{
//    case Name (first, last) => println(author)
//    case Name (first, middle, last) => println(first + " " + last)
//    case Name (first, "van" , "der", last) => println("Hello alzio!")
//  }
//}
//
//object Name {
//  def unapplySeq(input : String) : Option[Seq[String]]=
//    if(input.trim() == "") None
//    else Some(input.trim.split("\\s+"))
//}
