println("Objects inside the lists are immutable")



def printList(list: List[String]):Unit = {
	list.foreach(word => print(word+" "))
	println()
}

val languages = List[String]("Python","Scala","Java")

printList(languages)

val allLanguages = languages ::: List("C", "C++")

printList(allLanguages)

printList("JavaScript" :: allLanguages)

//this operation is costly than :: as the time taken increases linearly with length
printList(allLanguages :+ "JavaScript")

