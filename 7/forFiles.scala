val files = (new java.io.File(".")).listFiles

def fileLines(file: java.io.File) = 
	scala.io.Source.fromFile(file).getLines().toList

def grep(pattern: String) = 
	for(file <- files if file.getName.endsWith(".scala");
		line <- fileLines(file); 
		trimmed = line.trim
		if trimmed.matches(pattern)
 		) yield trimmed

val lines = grep(".*import.*")

for(line <- lines) println(line)