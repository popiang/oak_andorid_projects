package com.popiang.objectorientedprogramming.abstract

class Car() : Vehicle() {
    override fun vehicleName(name: String): String {
        return name;
    }

    override var model: Int? = null
        get() = field
        set(value) {
            field = value
        }
}