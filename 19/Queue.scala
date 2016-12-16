trait Queue[T] {
	def head: T
	def tail: Queue[T]
	def enqueue(x: T): Queue[T]
}

object Queue {

	def apply[T](elems: T*): Queue[T] = new QueueImpl(elems.toList, Nil)

	private class QueueImpl[T](
			private val leading: List[T],
			private val trailing: List[T]
		) extends Queue[T]{

		def mirror:QueueImpl[T] = {
			if (leading.isEmpty) new QueueImpl(trailing.reverse, Nil)
			else this
		}

		def head:T = mirror.leading.head

		def tail:QueueImpl[T] = {
			val q = mirror
			new QueueImpl(q.leading.tail, q.trailing)
		}

		def enqueue(x: T) = {
			new QueueImpl(leading, x :: trailing)
		}


		override def toString = {
			val q = mirror
			"Queue" + q.leading.mkString("",",",",") + q.trailing.reverse.mkString(",")
		}
	}

}


val q = Queue(1,2,3,4)

println(q)

val q2 = q.enqueue(5)

println(q2)

println(q.head)