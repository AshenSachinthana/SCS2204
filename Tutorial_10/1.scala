object Q1{
    def main(args: Array[String]): Unit = {
        val celsiusTemp: List[Double] = List(0, 10, 20, 30)
        val averageFahrenheit = calculateAverage(celsiusTemp)
        println(s"Average Fahrenheit : $averageFahrenheit")
    }

    def calculateAverage(celsiusTemp: List[Double]): Double = {
        val fahrenheitTemp: List[Double] = celsiusTemp.map(c => (c * 9 / 5) + 32)

        val sum: Double = fahrenheitTemp.reduce((a, b) => a + b)

        val averageFahrenheit: Double = sum / fahrenheitTemp.length
        averageFahrenheit
    }
}
 