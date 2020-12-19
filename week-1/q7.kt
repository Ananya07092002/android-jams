package com.example.week1assignment

fun main() {
    println("Enter number who's factorial is to be calculated:")
    val num1:Int=Integer.valueOf(readLine())
    val num2:Int
    var factorial =1
    for (num2 in 1..num1) {
        factorial *= num2
    }
    println("The factorial of $num1 is $factorial")
}
