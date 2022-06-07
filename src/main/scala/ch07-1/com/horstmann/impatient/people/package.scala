package `ch07-1`.com.horstmann.impatient.people

import `ch07-1`.com.horstmann.impatient.people.people.defaultName

package object people{
  val defaultName = "Alzio A. Public"
}
class Person{
    var name = defaultName
    def desc = "A person with name " + name
//    private[impatient] def desc = "A person with name " + name

  }