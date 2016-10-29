//objects inside arrays are mutable

val mission = new Array[String](7)

mission(0) = "I"
mission(1) = "live"
mission(2) = "and"
mission(3) = "breathe"
mission(4) = "Python"
mission(5) = "and"
mission(6) = "scala"


def printArray(array: Array[String]):Unit = {
	array.foreach(word => print(word+" "))
	println()
}

printArray(mission)
println("Objects inside arrays are mutable, The object Array[String] is not mutable")

mission(0) = "gautham"
printArray(mission)
