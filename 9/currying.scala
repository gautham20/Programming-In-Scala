def addCurry(x: Int)(y: Int) = x + y

println(addCurry(2)(3))

val addTen = addCurry(10)_

println(addTen(15))