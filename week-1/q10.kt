package com.example.week1assignment

fun main() {
    println("Enter the height of pyramid you wish to print:")
    var num1:Int=Integer.valueOf(readLine())
    var num2:Int
    var num3:Int
    for (num2 in 1..num1) {
        for (num3 in 1..num2) {
            print("#")
        }
        println()
    }
}
