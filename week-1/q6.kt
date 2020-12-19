package com.example.week1assignment

fun main() {
    println("Enter a character:")
    val char=readLine()!![0]
    if (char in 'a'..'z'|| char in 'A'..'Z')
        println("$char is an alphabet.")
    else
        println("$char is not an alphabet.")
}
