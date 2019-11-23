package com.chanse.code.interfaces

class PrintingCalculator : Calculator {
    override fun add(a: Int, b: Int): Int {
        println("$a + $b = ${a + b}")
        return a + b
    }

    override fun sub(a: Int, b: Int): Int {
        println("$a - $b = ${a - b}")
        return a - b
    }
}
