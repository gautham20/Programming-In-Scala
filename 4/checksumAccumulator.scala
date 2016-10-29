import scala.collection.mutable

class checksumAccumulator{
	private var sum = 0
	def add(b: Byte) = sum += b
	def checksum(): Int = ~(sum & 0xFF) + 1

}

//Companion object

object checksumAccumulator{

	private val cache = mutable.Map[String,Int]()

	def calculate(word: String): Int = {
		if (cache.contains(word)){
			cache(word)
		}
		else{
			val acc = new checksumAccumulator
			for (c <- word){
				acc.add(c.toByte)
			}
			val cs = acc.checksum()
			cache += (word -> cs)
			cs
		}
	}
}