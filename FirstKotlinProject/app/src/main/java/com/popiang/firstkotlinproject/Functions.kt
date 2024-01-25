package com.popiang.firstkotlinproject

fun main(args: Array<String>) {

    print("Please enter the first number: ")
    val num1: Int = readln().toInt()

    print ("Please enter the second number: ")
    val num2: Int = readln().toInt()

    show(num1, num2)

    println("Sum of the numbers: " + add(num1, num2))
    println("The smaller number between the two numbers: " + findMinNumber(num1, num2))
}

fun show(num1: Int, num2: Int) {
    println("You entered $num1 and $num2")
}

fun add(num1: Int, num2: Int) : Int {
    return num1 + num2
}

fun findMinNumber(num1: Int, num2: Int) : Int {
    if (num1 < num2) {
        return num1
    } else {
        return num2
    }
}