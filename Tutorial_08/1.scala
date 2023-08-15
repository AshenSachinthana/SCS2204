object Q1 {
  def Interest(deposit:  Double):Double= deposit match{
    case x if x<=20000 => 0.02
    case x if x<=200000 => 0.04
    case x if x<=2000000 => 0.035
    case x if x>2000000 => 0.065
  }

  val calculate = (deposit: Double) => deposit * Interest(deposit)

  def main(args: Array[String]): Unit={
    print("Enter the deposit amount: ")
    val deposit = scala.io.StdIn.readDouble()

    println("Interest: " + calculate(deposit))
  }
}