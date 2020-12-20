package com.example.myapplication

fun main() {
    println("Enter the number of digits in the number")
    val n:Double= Integer.valueOf(readLine()).toDouble()
    println("Enter a number to check whether it is Armstrong or not:")
    val num1 = Integer.valueOf(readLine())
    var num2: Int
    var remainder: Int
    var result = 0
    num2 = num1
    while (num2 != 0) {
        remainder = num2 % 10
        result += Math.pow(remainder.toDouble(), n).toInt()
        num2 /= 10
    }
    if (result == num1)
        println("$num1 is an Armstrong number.")
    else
        println("$num1 is not an Armstrong number.")
}
