def msort[T](less: (T,T) => Boolean)
	(xs: List[T]): List[T] = {

		def merge(xs: List[T], ys: List[T]): List[T] = 
			(xs,ys) match {

				case (_,Nil) => xs
				case (Nil,_) => ys
				case (x :: xs1, y :: ys1) => 
					if (less(x,y)) x :: merge(xs1,ys)
					else y :: merge(xs,ys1)
			}

		val n = xs.length/2
		if (n == 0) xs
		else{
			val (ys,zs) = xs splitAt n
			merge(msort(less)(ys), msort(less)(zs))
		}

	}


val l = List(2,5,2,5,2,5,3)

val intSort = msort((x: Int, y: Int) => x < y)_

val sortedL = intSort(l)

println( sortedL.mkString(" "))