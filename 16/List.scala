val fruits = List("apple","Orange", "kiwi")

val allFruits = "guava" :: fruits

println(allFruits.head)
println(
	allFruits.tail.mkString(" ")
	)


println{fruits.length}

println(fruits.last)

println(
	fruits.init.mkString(" ")
	)

println(
	fruits.reverse.mkString(" ")
	)

val fruits2 = fruits take 2
val fruitsl3 = fruits drop 2

val (fs1,fs2) = fruits splitAt 2

println(fruits2)
println(fruitsl3)
println(fs1)
println(fs2)

println(fruits.apply(2))
println(fruits.indices)


println(
	fruits.map(_.toCharArray).flatten
	)

println(
	fruits zip allFruits
	)

val indexZip = fruits.zipWithIndex
println(indexZip)

println(indexZip.unzip)


println(
	fruits mkString ("eat ","\n", " everyday")
	)

println( fruits.toArray )

val fi = fruits.iterator

println(fi.next)
println(fi.next)