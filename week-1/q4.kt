package com.example.week1assignment

fun main() {
    println("Enter a number:")
    val num1:Int=Integer.valueOf(readLine())
    if (num1%5==0 && num1%11==0)
        println("The number is divisible by 5 and 11")
    else if (num1%5==0 && num1%11!=0)
        println("The number is divisible by 5 but not 11")
    else if (num1%5!=0 && num1%11==0)
        println("The number is divisible by 11 but not 5")
    else
        println("The number is neither divisible by 5 nor 11")
}
