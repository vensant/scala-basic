case class With[A,B](a: A, b: B)

val with1: With[String,Int] = With("Foo", 2)
val with2: String With Int = With("Bar", 3)
Seq(with1, with2) foreach { w =>
w match {
	case s With i => println(s"$s with $i")
	case _ => println(s"Unknown: $w")
	}
}