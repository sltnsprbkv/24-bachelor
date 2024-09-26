package expression

case class Complex(re: Double, im: Double) {

  def unary_- : Complex = new Complex(-re, -im)
  def +(c: Complex): Complex = new Complex(re + c.re, im + c.im)
  def -(c: Complex): Complex = this + -c
  def *(c: Complex): Complex = new Complex(re * c.re - im * c.im, re * c.im + im * c.re)

  override def toString: String = {
    this match {
      case Complex(0, 1) => "i"
      case Complex(0, -1) => "-i"
      case Complex(0, 0) => "0"
      case Complex(re, 0) => re.toString
      case Complex(0, im) => im.toString + "i"
      case _ => s"$re${if (im > 0) "+" else ""}${im}i"
    }
  }
}
