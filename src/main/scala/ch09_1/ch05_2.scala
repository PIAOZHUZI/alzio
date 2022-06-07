package ch09_1

import java.io.File
import java.nio.file._
import scala.collection.mutable.ArrayBuffer

object ch05_2 extends App {

  implicit def makeFileVisitor(f: (Path) => Unit) = new SimpleFileVisitor[Path]{
    override def visitFile(p: Path, attrs: attribute.BasicFileAttributes) =  {
      f(p)
      FileVisitResult.CONTINUE
    }

  }

  Files.walkFileTree(new File("./src/main/scala/ch09_1").toPath, (f:Path) => println(f))
}
@SerialVersionUID(42L)
class Person extends Serializable{
  val friends = new ArrayBuffer[Person]
  def desc = friends.mkString(", ")
}