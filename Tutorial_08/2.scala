object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val input = scala.io.StdIn.readInt()
    println(pattern(input))
  }

  def pattenMatch(input: Int):String = input match{
    case x if x<0 => "Negative"
    case x if x==0 => "Zero"
    case x if x%2==0 => "Even"
    case _ => "Odd"
  }

  val pattern = (input: Int) => pattenMatch(input)
}