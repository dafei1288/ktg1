package com.dafei1288.kt

fun main(args: Array<String>) {
    var a = 1
// 使用变量名作为模板:
    val s1 = "a is $a"
    a = 2
// 使用表达式作为模板:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)


    println(" which is bigger ?  ${maxOf(11, 22)}")

    fun printLength(obj: Any) {
        println("'$obj' string length is ${getStringLength(obj) ?: "... err, is empty or not a string at all"} ")
        }
                printLength("Incomprehensibilities")
                printLength("")
                printLength(1000)


    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    println("")
    println("")
    val items = setOf("orange", "banana", "apple")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    println("")
    println("")

    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toLowerCase() }
            .forEach { println(it+"1") }

    val nums = listOf(1,2,3,4,5)
    nums.filter {  it >= 3 }
            .sortedBy { it }
            .forEach{
                println("$it 1")
                println(" => ${it+1}")
                println(" => ${it}+1")
            }
    println("tttt".spcaceToCamelCase())


    val aa = "qq"
    val b = "$aa"
    println("$b")
}
fun maxOf(a: Int, b: Int) = if (a > b) a else b


fun getStringLength(obj: Any): Int? {
// obj 将会在&&右边自动转换为 String 类型
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }
fun String.spcaceToCamelCase():String {
    println("Convert this to camelcase。。。。。")
    return "aaaaaaaaaa";
}