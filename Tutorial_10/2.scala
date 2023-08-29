object Q2{
    def main(args: Array[String]): Unit = {
        val words: List[String] = List("apple", "banana", "cherry", "date")
        val total = countLetterOccurrences(words)
        println(s"Total count of letters: $total")
    }

    def countLetterOccurrences(words: List[String]): Int = {
        val wordLengths: List[Int] = words.map(word => word.length)

        val total: Int = wordLengths.reduce((a,b) => a + b)
        total
    }
}
