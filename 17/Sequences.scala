import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer


val emparr = new Array[Int](4)
val numarr = Array(1,2,3,4,5)

emparr(3) = numarr(3)

println(emparr.mkString(" "))
println(numarr.mkString(" "))

var rand = ListBuffer(3)

rand += 2

4 +=: rand

println(rand)
println(rand.toList)

var rand2 = ArrayBuffer(4,5,6)

rand2 += 4

5 +=: rand2

println(rand2(0))

println(rand2)

