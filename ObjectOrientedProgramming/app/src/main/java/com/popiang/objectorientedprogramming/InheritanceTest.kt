package com.popiang.objectorientedprogramming

fun main(args: Array<String>) {

    // creating an object from Car class
    var car = Car()
    car.type = "Car"
    car.model = "X70"
    car.maxSpeed = 200

    car.show()

    // creating an object from Motorcycle class
    var motor = Motorcycle()
    motor.type = "Motorcycle"
    motor.model = "LC135"
    motor.maxSpeed = 120

    motor.show()

}