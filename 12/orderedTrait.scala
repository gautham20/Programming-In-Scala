class OrderedRational(n:Int, d:Int) extends Ordered[OrderedRational] {
	require(d != 0)

	private val g = gcd(n.abs, d.abs)
	val numer: Int = n/g
	val denom: Int = d/g

	def this(n: Int) = this(n,1)

	override def toString = numer +"/"+ denom

	def + (that: OrderedRational): OrderedRational = new OrderedRational(
		this.numer * that.denom + that.numer * this.denom,
		this.denom * that.denom
		)

	def + (i: Int): OrderedRational = new OrderedRational(
		this.numer + i * this.denom,
		this.denom 
		)

	def - (that:OrderedRational) = new OrderedRational(
		this.numer * that.denom - that.numer * this.denom,
		this.denom * that.denom
		)


	def - (i: Int): OrderedRational = new OrderedRational(
		this.numer - i * this.denom,
		this.denom 
		)

	def * (that: OrderedRational) = new OrderedRational(
		this.numer * that.numer
,		this.denom * that.denom
		) 

	def * (i: Int) = new OrderedRational(
		this.numer * i,
		this.denom
		)

	def / (that: OrderedRational) = this * new OrderedRational(that.denom, that.numer)

	def / (i: Int) = new OrderedRational(
		this.numer,
		this.denom * i
		)

	def compare(that: OrderedRational): Int = {
		(this.numer * that.denom) - (that.numer * this.denom)
	}

	private def gcd(a: Int, b: Int): Int =
		if (b == 0) a else this.gcd(b, a%b)
}


val third = new OrderedRational(1,3)
val threeFourth  = new OrderedRational(3,4)

println(third > threeFourth)