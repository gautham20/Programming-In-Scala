val animes = Array[String]("naruto","boruto","bleach","one piece","Attack on titan")

def searchArray(i: Int): String = {
	if (animes(i).startsWith("o")) searchArray(i+1)
	else if (animes(i).split(" ").length > 1) animes(i)
	else searchArray(i+1)  
}

println(searchArray(0))