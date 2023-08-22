class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator must be nonzero")

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational): Rational =
    new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

  override def toString: String = s"$numer / $denom"
}

object Rational {
  def apply(n: Int, d: Int): Rational = new Rational(n, d)
}

object Main extends App {
  val x = Rational(3, 4)
  val y = Rational(5, 8)
  val z = Rational(2, 7)

  val result = x.sub(y).sub(z)

  println(s"x: $x")
  println(s"y: $y")
  println(s"z: $z")
  println(s"Result of x - y - z: $result")
}
