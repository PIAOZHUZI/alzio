package ch01

object ch02 {
  def main(args: Array[String]): Unit = {

    for(i <- 1 to 3; j <- 1 to 3){
      print((10*i+j)+ " ")
    }
    println()
    for(i<- 1 to 3 ; j<-1 to 3 if i!=j){
      print((10*i+j)+ " ")
    }

    println()
    for(i <-1 to 3 ; from = 4 -i; j<- from to 3){
      print((10*i+j) + " ")
    }

    for(i<- 1 to 10) yield i % 3


    for(c <- "Hello" ; i<- 0 to 1) yield  (c + i ).toChar
    //HIeflmImop
    for(i<- 0 to 1; c<- "Hello") yield (c + i).toChar
    //Vector('H', 'e' 'I' 'I' 'o" 'I' 'f' 'm' 'm' 'p')


  }
}
