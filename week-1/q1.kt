package com.example.week1assignment

fun main() {
    println("Enter a number:")
    val num1=Integer.valueOf(readLine())
    if (num1>0)
        println("The given number is Positive")
    else if (num1<0)
        println("The given number is Negative")
    else
        println("The given number is neither Positive nor Negative, it is 0")
}
