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

    //デフォルト引数のテスト
    //リスト2,4,2
    printUserInfo(1)
    printUserInfo(1, "Saito")

    //リスト2.4.5
    val test = User8(1)
    println(test.toString())

    //リスト2.5.7
    printCalcResult(10, 20, {num1, num2 -> num1 + num2})
    printCalcResult(10, 20, {num1, num2 -> num1 * num2})

    //リスト2.6.2
    println(6.square())

    //スコープ関数
    //with--複数の処理をまとめて行う
    //リスト2.7.1(with不使用)
//    val list = mutableListOf<Int>()
//    for(i in 1..10){
//        if(i % 2 == 1) list.add(i)
//    }
//    val oddNumbers = list.joinToString(separator = " ")
//    println(oddNumbers)

    //リスト2.7.2(with使用)
//    val oddNumbers = with(mutableListOf<Int>()){
//        for(i in 1..10){
//            if(i % 2 == 1)this.add(i)
//        }
//        this.joinToString(separator = " ")
//    }
//    println(oddNumbers)

    //run--NUllableなオブジェクトに複数の処理をまとめて行う
    //リスト2.7.4
//    val oddNumbers = mutableListOf<Int>().run{
//        for(i in 1..10){
//            if(i % 2 == 1)this.add(i)
//        }
//        this.joinToString(separator = " ")
//    }
//    println(oddNumbers)

    //リスト2.7.5
//    data class User(var nam: String)
//    fun getUserString(user: User?, newName: String): String? {
//        return user?.run {
//            nam = newName
//            toString()
//        }
//    }

    //let--Nullableなオブジェクトに名前をつけて処理を行う
    //リスト2.7.6
//    val oddNumbers = mutableListOf<Int>().let{ list ->
//        for(i in 1..10){
//            if(i % 2 == 1)list.add(i)
//        }
//        list.joinToString(separator = " ")
//    }
//    println(oddNumbers)

    //リスト2.7.7
//    data class User(val name: String)

//    fun createUser(name: String?): User?{
//        return name?.let{n -> User(n)}
//    }

    //リスト2.7.9
//    fun createUser(name: String?): User? {
//        return name?.let{User(it)}
//    }

    //apply--オブジェクトに変更を加えて返す
//    val oddNumbers = mutableListOf<Int>().apply{
//        for (i in 1..10){
//            if(i % 2 == 1)this.add(i)
//        }
//        this.joinToString(separator = " ")
//    }
//    println(oddNumbers)

    //
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

//デフォルト引数
fun printUserInfo(id: Int, name: String = "Default Name"){
    println("id=$id name=$name")
}

//リスト2.4.4
data class User8(val id: Int, val name: String ="Default Name")

//関数型の定義  ※(引数...) -> 戻り値の型
val calc: (Int, Int) -> Int = {num1, num2 -> num1 + num2}
//リスト2.5.4
val squared: (Int) -> Int = { it * it}

//高階関数(関数型のオブジェクトを引数に受け取る関数)
//fun printCalcReault(num1: Int, num2: Int, calc: (Int, Int)-> Int) {
//    val result = calc(num1, num2)
//    println(result)
//}

//リスト2.5.8
//fun printAdditionResult(x: Int, y: Int) {
//    println("足し算の結果を表示します")
//    printCalcResult(x, y, {num1, num2 -> num1 + num2})
//    printCalcResult(x, y){num1, num2 ->
//        num1 + num2
//    }
//}

//fun printMultiplicationResult(x: Int, y: Int){
//    println("掛け算に結果を表示します")
//    printCalcResult(x, y, {num1, num2 -> num1 * num2})
//}

//タイプエイリアス　typealias 名前 = 関数型の定義
//リスト2.5.10
typealias Calc = (Int, Int)-> Int

//リスト2.5.11
fun printCalcResult(num1: Int, num2: Int, calc: Calc){
    val result = calc(num1, num2)
    println(result)
}

//拡張関数について
//リスト2.6.1(通常)
//fun square(num: Int): Int = num * num
//リスト2.6.2（拡張関数）
fun Int.square(): Int = this * this

//リスト2.7.12
data class User12(val id: Int, var name: String, var address: String)
fun getUser(id: Int): User {
    return User12(id, "Takehata", "Tokyo")
}
fun updateUser(id: Int, newName: String, newAddress: String){
    val user = getUser(id).apply{
        this.name = newName
        this.address = newAddress
    }
}