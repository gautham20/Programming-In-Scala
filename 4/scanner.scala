import checksumAccumulator.calculate

object scanner{
	def main(args: Array[String]):Unit = {
		for(arg <- args){
			println(calculate(arg)+"|"+arg)
		}
	}
}