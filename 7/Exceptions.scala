import java.io.FileNotFoundException
import java.io.IOException
import java.io.FileReader

val filename = if (args.length > 0) args(0) else ""

val file = 
	try{
		new java.io.FileReader(filename)
	}
	catch{
		case ex: FileNotFoundException => println("File Not Found")
		case ex: IOException => println("Some Exception")
		()
	}

