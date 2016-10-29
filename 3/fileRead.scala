import scala.io.Source

def widthOfLength(word:String) = word.length.toString.length


if (args.length > 0){
	
	val lines = Source.fromFile(args(0)).getLines().toList

	val longestLine = lines.reduceLeft(
		(a,b) => if (a.length > b.length) a else b
		)

	val maxWidth = widthOfLength(longestLine)

	for(line <- lines){
		val numspaces = maxWidth - widthOfLength(line)
		val padding = " "*numspaces
		println(padding+line.length+"|"+line)
	}

}