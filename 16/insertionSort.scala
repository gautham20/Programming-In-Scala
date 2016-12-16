//Insertion Sort

def sortList(list: List[Int]) = isSort(list)

def isSort(list: List[Int]): List[Int] = {
	if (list.isEmpty) Nil
	else insert(list.head, isSort(list.tail))
}

def insert(x: Int, list: List[Int]): List[Int] = {
	if (list.isEmpty || x <= list.head) x :: list
	else list.head :: insert(x, list.tail) 
}


val nums = List(4,2,5,3,2,1)

println(
	sortList(nums).mkString(" ")
	)