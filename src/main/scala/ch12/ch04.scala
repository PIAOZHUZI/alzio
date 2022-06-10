package ch12

import java.awt.event
import java.awt.event._
import javax.swing._

object ch04 extends App{

  var counter = 0
  val button =  new JButton("Increment")
//  button.addActionListener(new ActionListener {
//    override def actionPerformed(e: ActionEvent): Unit = {
//      counter += 1
//    }
//  })
//암묵변환
  implicit def makeAction(action : (event.ActionEvent) => Unit) = {
    new ActionListener {
      override def actionPerformed(e: event.ActionEvent): Unit = {
        action(e)
      }
    }
  }
  button.addActionListener((ee : event.ActionEvent) => counter +=1)
  button.addActionListener((ee : event.ActionEvent) => println(counter))
  button.addActionListener((ee : event.ActionEvent) => if(counter > 9 ) System.exit(0))

  val frame = new JFrame
  frame.add(button)
  frame.pack()
  frame.setVisible(true)

}
