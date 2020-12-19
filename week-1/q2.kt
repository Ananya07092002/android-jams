package com.example.week1assignment

fun main() {
    println("Enter the first number:")
    val num1:Int=Integer.valueOf(readLine())
    println("Enter the second number:")
    val num2:Int=Integer.valueOf(readLine())
    println("Enter the third number:")
    val num3:Int=Integer.valueOf(readLine())
    fun MaxOf(num1:Int,num2:Int,num3:Int)
    {
        if (num1 >= num2 && num1 >= num3)
            println("$num1 is the largest number.")
        else if (num2 >= num1 && num2 >= num3)
            println("$num2 is the largest number.")
        else 
            println("$num3 is the largest number.")
    }
    println(MaxOf(num1,num2,num3))
}
