class thermometer{
	var celsius: Float = _

	def farenheit: Float = {
		celsius * 9 / 5 + 32
	}

	def farenheit_= (f: Float) = {
		celsius = (f - 32)/9 * 5
	}

	override def toString() = {
		"farenheit" + farenheit + "/" + "celsius " + celsius
	}
}

val t = new thermometer

t.celsius = 100

println(t)

t.farenheit = 32

println(t)