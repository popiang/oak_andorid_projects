package com.popiang.firstkotlinproject

import kotlin.random.Random

fun main(args: Array<String>) {

//    var i:Int = 5;
//    while (i > 0) {
//        println(i--);
//    }
//
//    var factorial:Int = 3;
//    var result:Int = 1;
//
//    while(factorial > 0) {
//        result *= factorial;
//        factorial -= 1;
//    }
//
//    println(result);

    val number:Int = Random.nextInt(0, 10)
    print("Please guess the generated number between 1 to 10: ")
    var guessedNumber:Int = readln().toInt()

    while(guessedNumber != number) {
        print("Wrong. Please try again. Guess the generated number between 1 to 10: ")
        guessedNumber = readln().toInt()
    }

    println("You guessed the number correctly!!")
}