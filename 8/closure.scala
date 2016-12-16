val more = 10

def decreaser(sub: Int) = (x:Int) => x - sub

val numbers = Array(1,90,-2323,3,4,567)

println(numbers.map(_ + more).mkString(" "))

val d100 = decreaser(100)
val d11 = decreaser(11)
println(d100(101))
println(d11(101))