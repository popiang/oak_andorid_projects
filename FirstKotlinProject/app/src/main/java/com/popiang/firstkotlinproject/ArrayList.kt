package com.popiang.firstkotlinproject

fun main(args: Array<String>) {

    var age = ArrayList<Int>();

    age.add(10);
    age.add(1, 20);
    age.add(30);

    println(age);
    println("Third element: ${age[2]}");

    age.remove(20);
    println(age)
}