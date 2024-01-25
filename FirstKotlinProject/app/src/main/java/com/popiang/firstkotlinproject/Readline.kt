package com.popiang.firstkotlinproject

fun main(args: Array<String>) {

    print("What is your name? ");
    var name:String? = readLine();

    print("How old are you? ");
    var age:Int = readLine()!!.toInt();

    println("Your name is $name and you are $age years old.")
}