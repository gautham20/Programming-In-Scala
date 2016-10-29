
def makeRowSeq(i: Int, col: Int) = {
		for(j <- 1 to col) yield {
			val prod = (i*j).toString
			prod+" " 
		}
}

def makeRow(i: Int, col: Int) = makeRowSeq(i,col).mkString



def mtable(row: Int, col: Int): String = {
	val tables = 
		for(i <- 1 to row)
		yield makeRow(i, col)

	tables.mkString("\n")
}

println(mtable(12,10))