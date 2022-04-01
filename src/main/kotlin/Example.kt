fun printText(){
    val text = "Hello Kotlin."
    println(text)
}

fun countLength(str: String): Int {
    return str.length
}

fun main(){
    printText()
    val text = "数字カウントテスト"
    val num = countLength(text)
    println(num)
}