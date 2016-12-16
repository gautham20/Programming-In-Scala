import Element.elem

abstract class Element{
	def content: Array[String]
	def width: Int =  content(0).length
	def height: Int = content.length

	def above(that: Element): Element = {
		val this1 = this widen that.width
		val that1 = that widen this1.width
		elem(this1.content ++ that1.content)
	}

	def beside(that: Element): Element = {
		val this1 = this heighten that.height
		val that1 = that heighten this1.height
		elem(
				for ((line1,line2) <- this1.content zip that1.content) yield line1+line2 
			)
	}

	def widen(width: Int): Element = {
		if(this.width < width){
			val left = elem(' ', (width - this.width)/2, this.height)
			val right = elem(' ', width - (left.width + this.width), this.height)
			left beside this beside right
		}
		else this
	}

	def heighten(height: Int): Element = {
		if(this.height < height){
			val top = elem(' ',this.width, (height - this.height)/2 )
			val bottom = elem(' ' , this.width, height - (this.height + top.height))
			top above this above bottom
		}
		else this
	}

	override def toString = content mkString "\n"
}


object Element{

	private class ArrayElement(
			val content: Array[String] 
		) extends Element

	private class LineElement(
			val line: String 
		) extends Element {
		val content = Array(line)
	}

	private class UniformElement(
			val char: Char,
			override val width: Int,
			override val height: Int
		) extends Element {
		private val line = char.toString * width
		val content = Array.fill(height)(line)
	}


	def elem(content: Array[String]): Element = {
		new ArrayElement(content)
	}

	def elem(line: String): Element = {
		new LineElement(line)
	}

	def elem(ch: Char, width: Int, height: Int): Element = {
		new UniformElement(ch, width, height)
	}

}