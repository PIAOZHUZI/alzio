package ch07

//object ch01 extends App{
////  def main(args: Array[String]): Unit = {
////
////
////  }
//  val fred = new Employee(1729)
//  val myCounter = new Counter
//  println(fred + " :  "+ fred.description)
//  println(myCounter + " :  "+ myCounter.description)
//}

package com{
  package horstmann{
    object Utils{
      def percentOf(value : Double, rate : Double ) = value*rate/100
    }

    package impatient{

      import _root_.scala.collection.mutable.ArrayBuffer

      class Manager2{
        val a = new ArrayBuffer[Employee]
        def descriton = "a =" + a.length
      }
      class Employee(initialSalary : Double) {
        private var salary = initialSalary

        def description = "An employee with salary :" + salary

        def giveRaise(rate: scala.Double) {
          salary += Utils.percentOf(salary, rate)
        }
      }
    }
  }
}
package org{
  package bigjava{
    class Counter{
      private var value = 0
      def increment(): Unit = {
        value +=1
      }
      def description = "A count with value" + value
    }
  }
}

package com.horstmann.impatient{
  package people{

    import scala.collection.mutable.ArrayBuffer

    class Person(val name : String){
      var friends = new ArrayBuffer[Person]
      def desc = name + "with friends" +friends.map(_.name).mkString(", ")
    }
  }
}