package com.example.myapplication
fun even(list: List<Int>) {
    for (i in list) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
fun factorial(number: Int) {
    var result = 1
    var num = number
    while (num != 1) {
        result *= num
        num -= 1
    }
    println(result)
}

class Square(val width: Int, val height: Int){
    fun area() = println(width*height)
}

fun reverse(originalString: String) {
    var reversedString = ""
    for (character in originalString) {
        reversedString = character + reversedString
    }
    println(reversedString)
}



fun main() {
    val list = listOf(1, 3, 7, 15, 67, 102)
    even(list)
    factorial(9)
    val originalString = "Kotlin"
    Square(5, 4).area()
    reverse(originalString)
}

