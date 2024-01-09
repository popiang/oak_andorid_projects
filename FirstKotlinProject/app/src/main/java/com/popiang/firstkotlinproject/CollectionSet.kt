package com.popiang.firstkotlinproject

fun main(args: Array<String>) {

//    var mySetArray = arrayListOf<Any>("Kotlin", 2, 2.3, 'K', true, "Kotlin");
//
//    println("Size: " + mySetArray.size);
//    println("Last element: " + mySetArray.last());

    var mySetArray = setOf<Any>("Kotlin", 2, 2.3, 'K', true, "Kotlin");

    println("Size: " + mySetArray.size);
    println("Last element: " + mySetArray.last());

}