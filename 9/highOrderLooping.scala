val nums = List(1,2,3,4,5,6,12)

val evenExist = nums.exists(_ % 2 == 0)

val evens = nums.filter(_ % 2 == 0)

println(evenExist)
println(evens.mkString(" "))