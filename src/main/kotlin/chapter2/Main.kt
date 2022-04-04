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

    //データクラス
    //リスト2.3.6
    //アクセサメソッド
    val user7 = User7(1, "Sauti")
    user.name = "kotukn"
    println(user.name)

    //リスト2.3.7
    //equals
    val user71 = User7(1, "Sanio")
    val same = User7(1, "Sanio")
    val other = User7(2, "Sanio")
    println(user71 == same)
    println(user71 == other)

    //hashcode
    //リスト2.3.8
    val user72 = User7(1,"Takegana")
    val same72 = User7(1,"Takegana")
    val other72 = User7(2,"Takegana")
    println("user=${user72.hashCode()}")
    println("same=${same72.hashCode()}")
    println("same=${other72.hashCode()}")
    val set72 = hashSetOf(user72)
    println(set72.contains(same72))
    println(set72.contains(other72))
    //リスト2.3.9
    println(user72.toString())
    //componentN
    println(user72.component1())
    println(user72.component2())
    //copy関数
    val updated = user72.copy(1, "Kotlin")
    println(updated.toString())

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
//class User6{
//    val id: Int = 1
//    val name = "Kotlin"
//}

//リスト2.3.3
class User6{
    val id: Int = 1
    val name = "Kotlin"

    override fun equals(other: Any?):Boolean{
        if(this === other) return true
        if(javaClass != other?.javaClass) return false

        other as User6

        if(id != other.id) return false
        if(name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return 31 *name.hashCode() + id
    }

    override fun toString(): String {
        return "User6(id=$id, name=$name)W"
    }
}

//データクラスの定義
//リスト2.3.5
//リスト2.3.12(拡張プロパティ)
data class User7(val id: Int, val name: String){
    val isValidName: Boolean
    get() = name != ""
}

