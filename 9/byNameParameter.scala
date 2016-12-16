val assersionsEnabled = true

def myAssert(predicate: => Boolean) = {
	if(assersionsEnabled && !predicate) throw new AssertionError
}

var test = 1

myAssert(5 > 3)

myAssert{
	test = 0
	test > -1
}

println(test)