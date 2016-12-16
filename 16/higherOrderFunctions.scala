val nums = List(1,2,3,4,5,6)
val names= List("gautham", "naveen", "devesh")

def printList[T](l:List[T]): Unit = {
	println(l.mkString(" ")) 	
}

printList( nums.map(_* 3) )
printList(names.flatMap(_.toList.reverse))

var sum = 0

nums.foreach(sum += _)

println(sum)

printList(nums filter (_%2 == 0))

val (even,odd) = nums partition (_%2 == 0)

printList(even)
printList(odd)

printList(nums takeWhile (_ < 4))

printList(nums dropWhile (_ < 4))

val (firstHalf, secondHalf) = nums span (_ < 4)

printList(firstHalf)
printList(secondHalf)

println(nums find (_%4==0))


println(
	nums forall (_<10)
	)

println(
	nums exists (_%4 == 0)
	)

printList(
	(List[String]() /: names)((ys, y) => y :: ys)
	)

printList(
	("gautham".toList :\ List[String]())(_.toString 	 :: _)
	)

printList(
	names sortWith (_ < _)
	)