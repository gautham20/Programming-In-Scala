val n1 = List(1,2,3)
val n2 = List(4,5,6)

def append[T](n1: List[T], n2: List[T]): List[T] = n1 match{
	case List() => n2
	case x :: rest => if (rest.isEmpty) x :: n2
					else x :: append(rest, n2)
}

println(
	append(n1,n2).mkString(" ")
	)


println(
	append(
			List("Gautham", "Kumaran"),
			List("Came up with", "this","on his own :D")
		).mkString(" ")
	)