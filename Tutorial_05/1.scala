object Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter Number :")
    val number = scala.io.StdIn.readInt()
    val isPrime = prime(number)
    println(isPrime)
  }

  def prime(n: Int, i: Int = 2): Boolean = {
    if (n <= 1)
      false
    else if (i * i > n)
      true
    else if (n % i == 0)
      false
    else
      prime(n, i + 1)
  }
}
