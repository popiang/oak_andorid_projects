package com.popiang.objectorientedprogramming.overide

class Car : Vehicle() {

    fun superStart() {
        super.start()
    }

    fun superAccelerate(speed:Int) {
        super.accelerate(speed)
    }

    fun superStop() {
        super.stop()
    }

    override fun start() {
        println("Car has started")
    }

    override fun accelerate(speed:Int) {
        println("Car accelerates at $speed")
    }

    override fun stop() {
        println("Car has stopped")
    }
}