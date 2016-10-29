object findLonglines{
	def main(args: Array[String]):Unit = {
		val width = args(0).toInt
		val filelines = for(filename <- args.drop(1)) yield {
			Longlines.processFile(filename, width).mkString("\n")
		}
		for(longlines <- filelines) println(longlines)
	}
}