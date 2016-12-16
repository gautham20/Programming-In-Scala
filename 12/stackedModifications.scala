import scala.collection.mutable.ArrayBuffer

abstract class IntQueue{
	def get(): Int
	def put(x: Int) 
}

class BasicIntQueue extends IntQueue{
	private val buf = new ArrayBuffer[Int]
	def get(): Int = buf.remove(0)
	def put(x: Int) = { buf += x }
}

trait doubling extends IntQueue{
	override abstract def put(x: Int) = {
		super.put(x * 2)
	}
}

trait onlyPositives extends IntQueue{
	override abstract def put(x: Int) = {
		if (x>0) super.put(x)
	}
}

trait increment extends IntQueue{
	override abstract def put(x: Int) = {
		super.put(x+1)
	}
}

val queue = new BasicIntQueue with onlyPositives with increment with doubling

queue.put(0)
queue.put(12)
queue.put(24)

println(queue.get())
println(queue.get())
println(queue.get())