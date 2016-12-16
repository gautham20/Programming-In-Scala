val nums = List(11,4,4,2,12,234,5,234124,2)

val first :: second :: rest = nums

println(first)
println(second)
println(rest.mkString(" "))


def isSort(list: List[Int]): List[Int] = list match {
	case List() => List()
	case x :: rest => insert(x, isSort(rest))
}

def insert(x: Int, list: List[Int]): List[Int] = list match {
	case List() => List(x)
	case y :: rest => if (x <= y) x :: list
					else y :: insert(x, rest)  
}

println(isSort(nums) mkString " ")