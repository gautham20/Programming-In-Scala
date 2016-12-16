object fileMatcher{
	private def filesHere = (new java.io.File("../7")).listFiles

	def filematcher(matcher: String => Boolean) = {
		for(file <- filesHere if matcher(file.getName)) yield file
	}

	def fileEndsWith(query: String) =  filematcher(_.endsWith(query))

	def fileContains(query: String) =  filematcher(_.contains(query))

	def fileRegex(query: String) = filematcher(_.matches(query))
}


val query = if (args.length>0) args(0) else "for"

val fileList = fileMatcher.fileContains(query)

for(file <- fileList) println(file)