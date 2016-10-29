//Same as sets there are muttable and immutable Maps
//default is immutable

val priorities = Map[Int,String](
	1 -> "Be Passionate about what you do",
	2 -> "Earn a lot so that you can retire at 30",
	3 -> "Don't screw up your life too much in the process"
	)

for(i <- 1 to 3){
	println(priorities(i))
}
