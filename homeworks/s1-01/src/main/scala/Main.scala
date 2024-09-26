import expression.Complex

import scala.io.StdIn.readLine

object Main extends App {

  println("Enter 1 complex real number: ")
  val c1Re = readLine().replace(" ", "").toInt
  println("Enter 1 complex imaginary number: ")
  val c1Im = readLine().replace(" ", "").toInt
  println("Enter 2 complex real number: ")
  val c2Re = readLine().replace(" ", "").toInt
  println("Enter 2 complex imaginary number: ")
  val c2Im = readLine().replace(" ", "").toInt

  val c1 = Complex(c1Re, c1Im)
  val c2 = Complex(c2Re, c2Im)

  println("Enter one type of operation: +, -, *")
  val operation = readLine().replace(" ", "")

  val resultStr: (Complex, Complex, String, Complex) => String = (c1, c2, op, cRes) => s"\nResult: ($c1) $op ($c2) = $cRes"

  operation match {
    case "+" => println(resultStr(c1, c2, "+", c1 + c2))
    case "-" => println(resultStr(c1, c2, "-", c1 - c2))
    case "*" => println(resultStr(c1, c2, "*", c1 * c2))
    case _ => println("Invalid operation")
  }
}
