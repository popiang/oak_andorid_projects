package com.popiang.firstkotlinproject

fun main(args: Array<String>) {

//    for (i in 1..10) {
//        println(i);
//    }

//    var sum:Int = 0;
//
//    for (i in 1..5) {
//        println(i);
//        sum += i;
//    }

//    println(sum);

//    var sum:Int = 0;
//
//    for (i in 1..10) {
//        if (i % 2 == 0) {
//            println(i);
//            sum += i;
//        }
//    }
//
//    println("Sum of even numbers: $sum");

//    var myNumberArray = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//    for (i in myNumberArray) {
//        println(i)
//    }

//    var myNumberArray = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//    for (i in 0..(myNumberArray.size) - 1) {
//        println("myNumberArray[$i] = ${myNumberArray.get(i)}");
//    }

//    var myNumberArray = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//    for (i in myNumberArray.indices) {
//        println("myNumberArray[$i] = ${myNumberArray.get(i)}");
//    }

    var myNumberArray = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    myNumberArray.forEach {
        println(it)
    }



}