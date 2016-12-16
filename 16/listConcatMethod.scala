val nums = List.range(10,1,-1)

val horbar = List.fill(30)('~')

val square = List.fill(5,5)('*')

val tables = List.tabulate(11,11)(_*_)

val numbar = List.concat(nums,horbar)


def printLists[T](lists:List[T]*): Unit = {
	lists.foreach(l => {
		println(l.mkString(" "))
		println()
		}
	) 	
}

printLists(nums,horbar,square,tables,numbar)
