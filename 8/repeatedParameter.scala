def mean(nums: Int*): Float = {
	val n = nums.length
	var sum = nums.sum
	sum.toFloat/n
}

println(mean(1,2,3))
println(mean(10,20,10,320,3232032,302,32))

val nums = Array(1,2,23,4,2,3,4)

println(mean(nums: _*))