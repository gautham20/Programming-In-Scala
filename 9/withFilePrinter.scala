

def withFilePrinter(fileName: String)(op: java.io.PrintWriter => Unit) = {
	val file = new java.io.File(fileName)
	val writer = new java.io.PrintWriter(file)
	try{
		op(writer)
	}
	finally{
		writer.close()
	}
}


withFilePrinter("dummy.txt"){ 
	_.println("Gautham was here")
}