class Rational(n:Int, d:Int){
	require(d != 0)

	private val g = gcd(n.abs, d.abs)
	val numer: Int = n/g
	val denom: Int = d/g

	def this(n: Int) = this(n,1)

	override def toString = numer +"/"+ denom

	def + (that: Rational): Rational = new Rational(
		this.numer * that.denom + that.numer * this.denom,
		this.denom * that.denom
		)

	def + (i: Int): Rational = new Rational(
		this.numer + i * this.denom,
		this.denom 
		)

	def - (that:Rational) = new Rational(
		this.numer * that.denom - that.numer * this.denom,
		this.denom * that.denom
		)


	def - (i: Int): Rational = new Rational(
		this.numer - i * this.denom,
		this.denom 
		)

	def * (that: Rational) = new Rational(
		this.numer * that.numer,
		this.denom * that.denom
		) 

	def * (i: Int) = new Rational(
		this.numer * i,
		this.denom
		)

	def / (that: Rational) = this * new Rational(that.denom, that.numer)

	def / (i: Int) = new Rational(
		this.numer,
		this.denom * i
		)

	def lessthan(that: Rational) = 
		this.numer * that.denom < that.numer * that.denom
	

	def max(that: Rational) = 
		if(this.lessthan(that)) that else this

	private def gcd(a: Int, b: Int): Int =
		if (b == 0) a else this.gcd(b, a%b)
}