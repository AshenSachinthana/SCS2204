val alphabetUpper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
val shift=5
object Q1 extends App{

    def encryptText(text:String):String=
        if (text=="") 
            ""
        else 
            f"${encryptLetter(text(0))}${encryptText(text.substring(1))}"



    def encryptLetter(letter:Char):Char={
        if(letter.isUpper){
            alphabetUpper(
                (alphabetUpper.indexOf(letter)+shift)
                %alphabetUpper.length()
                )
        }
        else if (letter.isLower){
            alphabetUpper(
                (alphabetUpper.indexOf(letter.toUpper)+shift)
                %alphabetUpper.length()
                )
                .toLower
        }
        else{
            letter       
        }
    }

    def decryptText(text:String):String=
        if (text=="") 
            ""
        else 
            f"${decryptLetter(text(0))}${decryptText(text.substring(1))}"

    def decryptLetter(letter:Char):Char={
        if(letter.isUpper){
            alphabetUpper(
                (alphabetUpper.length()+alphabetUpper.indexOf(letter)-shift)
                %alphabetUpper.length()
                )
        }
        else if (letter.isLower){
            alphabetUpper(
                (alphabetUpper.length()+alphabetUpper.indexOf(letter.toUpper)-shift)
                %alphabetUpper.length()
                )
                .toLower
        }
        else{
            letter       
        }
    }

    def cipher(text:String,function:String=>String):String={
        function(text);
    }

    println(cipher("Hello",encryptText))
    println(cipher("Mjqqt",decryptText))

}
