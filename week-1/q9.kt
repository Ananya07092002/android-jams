package com.example.week1assignment

fun main() {
    println("Enter the number of numbers of which you wish to print sum of even numbers:")
    var num1:Int=Integer.valueOf(readLine())
    var num2:Int
    var sum:Int=0
    for (num2 in 0..2*num1 step 2) {
       sum+=num2
    }
    println("Sum of $num1 even numbers is $sum")
}
