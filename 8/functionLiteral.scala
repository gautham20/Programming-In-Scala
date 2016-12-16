var options = Array[String]("green Trends","naturals")
var numbers = Array(1,4,-11,32,100)

println(options.map(x => x.length()).mkString("\t"))


val positives = numbers.filter(_ > 0)
println(positives.mkString(" "))