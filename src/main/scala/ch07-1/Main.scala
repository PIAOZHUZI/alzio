import `ch07-1`.com.horstmann.impatient.people.Person

import java.awt.Color.decode
import java.awt._


object Main extends App {
  Color.RED
  Font.BOLD
  decode("#FFFF00")

  var john = new Person
  println(john.desc)

}
//
//def handler(evt: event.ActionEvent){
//  println(evt)
//  System.exit(0)
//}