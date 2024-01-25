package com.popiang.objectorientedprogramming

class MyCar constructor(var name:String, var model:Int) {

    // primary constructor
    init {
        println("Car name is ${this.name} and the model year is ${this.model}");
    }

}