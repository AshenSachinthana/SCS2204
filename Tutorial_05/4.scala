object Q4 {
  def main(args: Array[String]): Unit = {
    print("Enter Number :")
    val number = scala.io.StdIn.readInt()
    val isEven = isEvenNumber(number)
    if (isEven)
      println("Even")
    else
      println("Odd")
  }

  def isEven(n: Int): Boolean = {
    if (n == 0)
      true
    else if (n == 1)
      false
    else
      isEven(n - 2)
  }
}
