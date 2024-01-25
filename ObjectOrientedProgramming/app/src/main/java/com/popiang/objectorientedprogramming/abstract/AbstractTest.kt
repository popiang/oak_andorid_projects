package com.popiang.objectorientedprogramming.abstract

fun main(args: Array<String>) {

    // var vehicle = Vehicle()

    var car = Car()
    car.model = 2020
    car.speed = 300

    println("Name: ${car.vehicleName("Ferrari")} \n " +
            "Type: ${car.vehicleType("Car")} \n " +
            "Model: ${car.model} \n " +
            "Speed: ${car.speed}")
}