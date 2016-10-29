import scala.io.Source

object Longlines{

	def processFile(filename:String, width: Int) = {
		val file = Source.fromFile(filename)
		val lines = file.getLines().toList
		val longlines = for(line <- lines if line.length > width) yield {
			filename+"|"+line.trim()
		}
		longlines
	}
}