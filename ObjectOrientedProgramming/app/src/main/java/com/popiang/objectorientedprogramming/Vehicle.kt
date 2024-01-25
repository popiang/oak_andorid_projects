package com.popiang.objectorientedprogramming

open class Vehicle {

    var type:String? = null
    var model:String? = null
    var maxSpeed:Int? = null

    fun show() {
        println("Type: ${this.type}")
        println("Model: ${this.model}")
        println("Max speed: ${this.maxSpeed}")
    }
}