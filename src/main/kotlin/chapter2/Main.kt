fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    println(getOddOrEvenNumberText(99))

    val user = User3()
//    println(user.name)
    user.name = "SAito"
    println(user.name)

    //リスト2.2.9(getterの拡張確認)
    val name = User4()
    name.name = "PEPE"
    println(name.isValidName)

    //リスト2.2.11(setterの拡張確認)
    val user5 = User5()
    user5.name = ""
    println(user5.name)
    user5.name = "BOYTG"
    println(user5.name)

    //リスト2.3.2
    val userA = User6()
    val userB = User6()
    //toString関数の結果
    println(userA.toString())
    println(userB.toString())
    //hashCode関数の結果
    println(userA.hashCode())
    println(userB.hashCode())
    //equals関数での比較
    println(userA == userB)
    //hashCode関数、equals関数での比較
    val set = hashSetOf(userA)
    println(set.contains(userB))
}

//リスト2.1.1
//fun printOddOrEvenNumberText(num: Int){
//    var text = ""
//    if(num % 2 == 1){
//        text = "奇数"
//    } else {
//        text = "偶数"
//    }
//    println(text)
//}

//リスト2.1.2
//fun printOddOrEvenNumberText(num: Int){
//    val text = if(num % 2 == 1){
//        "奇数"
//    } else {
//        "偶数"
//    }
//    println(text)
//}

//リスト2.1.4
//fun printOddOrEvenNumberText(num: Int){
//    val text = if(num % 2 == 1) "奇数" else "偶数"
//    println(text)
//}

//リスト2.1.6
fun getOddOrEvenNumberText(num: Int): String{
    return if(num % 2 == 1){
        "奇数"
    } else {
        "偶数"
    }
}

//リスト2.2.1
class User1 {
    var name: String = ""
}

//リスト2.2.6(遅延初期化プロパティ varでのみ使用可)
class User3 {
    lateinit var name: String
}

//リスト2.2.8(getterの拡張)
class User4 {
    lateinit var name: String
    val isValidName: Boolean
        get() = name != ""
}

//リスト2,2,10(setterの拡張)
class User5 {
    var name: String = ""
    set(value){
        if(value == ""){
            field = "Kotlin"
        } else {
            field = value
        }
    }
}

//リスト2.3.1
class User6{
    val id: Int = 1
    val name = "Kotlin"
}