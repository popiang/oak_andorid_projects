package com.popiang.firstkotlinproject

fun main(args: Array<String>) {

    print("Please enter a number: ");
    val number:Int = readln().toInt();

    if (number % 2 == 0) {
        println("$number is an even number");
    } else {
        println("$number is an odd number");
    }
}