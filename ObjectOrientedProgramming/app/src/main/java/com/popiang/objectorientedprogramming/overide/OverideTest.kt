package com.popiang.objectorientedprogramming.overide

fun main(args: Array<String>) {

    var vehicle = Vehicle()

    vehicle.start()
    vehicle.accelerate(80)
    vehicle.stop()

    println("--------------------------------")

    var car = Car()

    car.superStart()
    car.superAccelerate(300)
    car.superStop()

    car.start()
    car.accelerate(90)
    car.stop()

}