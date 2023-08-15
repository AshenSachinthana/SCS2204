object  Q3 {
    def main(args: Array[String]): Unit = {

    val formatNames=(name:String,function:String=>String)=>function(name)

    println(formatNames("Niroshan",(string:String)=>string.toUpperCase()))
    println(formatNames("Benny",(string:String)=>string.toLowerCase()))
    println(formatNames("Saman",(string:String)=>string.toUpperCase()))
    println(formatNames("Kumara",(string:String)=>string.toLowerCase()))

    }

}