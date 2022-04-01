fun printText(){
    val text = "Hello Kotlin."
    println(text)
}

fun countLength(str: String): Int {
    return str.length
}

fun displayMessage(message: String){
    println(message)
}
//if文分岐
fun ifExample(num: Int){
    if(num < 10){
        println("less than 10")
    }else if(num == 10){
        println("equal to 10")
    }else{
        println("greater than 10")
    }
}

//when文分岐
//fun whenExample(num: Int){
//    when(num){
//        100 -> {
//            println("Equal to 100")
//        }
//        200 -> {
//            println("Equal to 200")
//        }
//        else -> {
//            println("Undefined value")
//        }
//    }
//}

class Human {
    fun showName(name: String){
        println(name)
    }
}

fun main(){
    printText()
    val text = "数字カウントテスト"
    displayMessage(text)
    val num = countLength(text)
    println(num)
    ifExample(num)

    //以下、for文
//    for(i in 1..10){
//        println("i is $i")
//    }

//    for(i in 1 until 10 step 2){
//        println("i is $i")
//    }

//    val list = listOf(1,2,5,6,10)
//    for(i in list){
//        println("i is $i")
//    }

    val human = Human()
    human.showName("Saito")

}