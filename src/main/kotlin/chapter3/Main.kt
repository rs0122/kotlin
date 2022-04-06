package chapter3

import CalcJava
import HelloByJava

fun main(args: Array<String>) {
    list3_1_2()
    list3_3_3()
    list3_3_6()
    list3_4_4()
}

// Javaクラスからの呼び出し
fun list3_1_2(){
    val hello = HelloByJava()
    hello.printHello()
}

//Javaで作成されたクラスを継承可能
fun list3_3_3(){
    val dog = DogKotlin()
    dog.cry()
}
//Javaのインターフェース実装
fun list3_3_6(){
    val greeter = GreeterImplKotlin()
    greeter.hello()
}
//Javaの関数型インターフェイス
fun list3_4_4(){
    val function = CalcJava{num1, num2 -> num1 + num2}
    println(function.calc(1,3))
}