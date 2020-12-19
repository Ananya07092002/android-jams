package com.example.week1assignment

fun main() {
    println("Enter the 1st side of the triangle: ")
    val side1 = Integer.valueOf(readLine())
    println("Enter the 2nd side of the triangle: ")
    val side2 = Integer.valueOf(readLine())
    println("Enter the 3rd side of the triangle: ")
    val side3 = Integer.valueOf(readLine())
    println("The 3 sides of the triangle are: $side1, $side2, $side3")
    if (side1==side2 && side2==side3)
        println("The given triangle is equilateral")
    else if (side1==side2 || side2==side3 || side3==side1)
        println("The given triangle is isosceles")
    else
        println("The given triangle is scalene")
}
