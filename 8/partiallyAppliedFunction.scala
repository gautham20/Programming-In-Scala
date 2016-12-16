def mean(a: Int, b: Int, c:Int):Float = (a+b+c).toFloat/3


val m1 = mean(_: Int,1,1)
val m2 = mean(_: Int,_: Int,1)
val m = mean _

println(m(2,3,4))
println(m2(9,8))
println(m1(3))