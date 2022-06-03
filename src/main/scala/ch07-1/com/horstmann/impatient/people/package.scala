package `ch07-1`.com.horstmann.impatient

package object people{
  val defaultName = "Alzio A. Public"
}
package people{
  class Person{
    var name = defaultName
    def desc = "A person with name " + name
//    private[impatient] def desc = "A person with name " + name

  }
}