package com.popiang.objectorientedprogramming

fun main(args: Array<String>) {

//    var myCar = Car();
//    myCar.name = "Proton"
//    myCar.model = 2020
//
//    println("My car is ${myCar.name}");

//    var myNewCar = MyCar("Proton", 2021)

//    println("My new car is ${myNewCar.name}")

    var mySecondCar = MySecondCar("Produa", 2020)

    mySecondCar.name = "Honda"
//    mySecondCar.model = 2018

    println("My second car is ${mySecondCar.name} and the model year is ${mySecondCar.model}")

}