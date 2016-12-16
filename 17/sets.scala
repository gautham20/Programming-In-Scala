import scala.collection.mutable

val x = Set("Gautham","loves","life")
val y = mutable.Set.empty[String]

y += "gautham"
y += "good"
y += "gautham"
y += "lalall"

println(x)
println(y)