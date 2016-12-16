import scala.collection.mutable

// count of words in a string


def wordCount(s:String): Map[String,Int] = {
	val words = s.split("[ !,.]+?").map(_.toLowerCase)
	var wordmap = Map.empty[String,Int]

	words.foreach( word =>
			wordmap += {
				if (wordmap.contains(word)) word -> (wordmap(word)+1)
				else word -> 1
			} 
		)
	wordmap
}


println(
		wordCount("Betty bought some butter the butter was bitter so better butter to bitter butter ") //can't type the whole thing
	)