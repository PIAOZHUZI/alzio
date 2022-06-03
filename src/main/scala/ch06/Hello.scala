package ch06

object Hello extends App {
//  def main(args: Array[String]): Unit = {
  if(args.length >0) {
    println("Hello," + args(0))
  }else{
    println("Hello Alzio")
  }
//  }
}
//scala>Hello Fred
