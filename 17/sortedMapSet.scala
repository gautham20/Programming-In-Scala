import scala.collection.immutable.TreeSet
import scala.collection.immutable.TreeMap

val nums = TreeSet(1,5,4,2,321,142,3,35,2,3,3,2,3)

println(nums)

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


val wcounts = TreeMap[String,Int]() ++ wordCount("gautham kumaran is gautham zmain ")

println(wcounts)