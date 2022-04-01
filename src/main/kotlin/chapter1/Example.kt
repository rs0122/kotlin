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

//クラス
class Human {
    fun showName(name: String){
        println(name)
    }
}

//継承
open class Animal(val name: String){
    fun showName() = println("name is $name")
    open fun cries() = println("")
}

//子クラス
class Dog(name: String) : Animal(name) {
    override fun cries() = println("bowwow")
}

//シールドクラス
sealed class Platform {
    abstract fun showName()
}

class AndroidPlatform: Platform(){
    override fun showName(){
        println("Android.")
    }
}

class IosPlatform: Platform() {
    override fun showName() {
        println("ios")
    }
}

//インターフェース
interface Greeter {
    fun hello()
}

class GreeterImpl: Greeter {
    override fun hello() {
        println("Hello")
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

    // コレクション
    // List(型推論ＯＫ)
    val intList: List<Int> = listOf<Int>(1, 2, 3)
    println(intList)
    println(intList[1])

    var stringList: List<String> = listOf<String>("one", "two", "three")
    println(stringList)
    println(stringList[1])

    //add関数を仕様出来るのはMutableList型
    var mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println(mutableList)

    //Map(型推論ＯＫ)
    val map: Map<Int, String> = mapOf(1 to "One", 2 to "two", 3 to "three")
    val map2: Map<String, Int> = mapOf("One" to 1, "three" to 3)
    val map3 = mapOf("ONE" to "SAITO", "TWO" to "KOUCHI")
    println(map)
    println(map2)
    println(map3)
    //キーの存在確認
    println(map.containsKey(3))
    println(map.containsKey(4))
    //変更可能
    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "One", 2 to "two", 3 to "three")
    mutableMap[4] = "four"
    println(mutableMap)

    //Set(型推論ＯＫ)
    val set = setOf("one", "two", "three")
    println(set.contains("three"))
    println(set.contains("four"))
    //変更可能
    var mutableSet = mutableSetOf("one", "two", "three")
    mutableSet.add("four")
    println(mutableSet)
}