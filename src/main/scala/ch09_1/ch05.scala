package ch09_1

import java.io.File

object ch05 extends App{

  def subdirs (dir : File) : Iterator[File]= {
    val child = dir.listFiles.filter(_.isDirectory())
    child.toIterator ++ child.toIterator.flatMap(subdirs _)
  }

  val home = new File("./src/main/scala") // 상대경로
  val dirs = subdirs(home)
  for(d <- dirs.take(20)){
    println(d)
  }

}
