package ch09_1

import java.io._

object ch03 {

  val file = new File("/Users/juhee/Documents/toy/alzio/src/main/scala/ch09_1/may.zip")
  val in = new FileInputStream(file)
  val bytes = new Array[Byte](file.length().toInt)
  in.read(bytes)

  in.close()

  printf("Zip files starts with %c%c, the initials of their inventor. \n", bytes(0),bytes(1))


}
