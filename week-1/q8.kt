package com.example.week1assignment

fun main() {
    println("Enter the number upto which you wish to calculate sum of factorials:")
    var num1:Int=Integer.valueOf(readLine())
    var num2:Int
    var num3:Int
    var factorial:Int=1
    var sumoffactorial:Int=0
    for (num2 in 1..num1) {
        for (num3 in 1..num2) {
            factorial=factorial*num3
        }
        sumoffactorial += factorial
        factorial=1
    }
    println("The sum of factorials upto $num1 is $sumoffactorial")
}
