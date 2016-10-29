import scala.io.Source

object Longlines{

	def processFile(filename:String, width: Int) = {
		def processLine(line: String) yield {
			if(line.length > width) filename+"|"+line.trim()
		}

		val file = Source.fromFile(filename)
		val lines = file.getLines().toList
		val longlines = for(line <- lines) yield {
			processLine(line)
		}
		longlines
	}
}