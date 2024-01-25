package com.popiang.objectorientedprogramming.interfaces

class Vehicle : CanGo, CanStop {
    override val name: String
        get() = "Ferrari"

    override fun stop() {
        println("Vehicle can stop...")
    }
}