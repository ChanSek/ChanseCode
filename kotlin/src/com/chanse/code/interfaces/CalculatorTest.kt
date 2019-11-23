package com.chanse.code.interfaces

fun main() {
    val calc = DefaultCalculator()
    calc.add(2, 3)
    calc.sub(2, 3)

    val printingCalc = PrintingCalculator()
    printingCalc.add(2, 3)
    printingCalc.sub(2, 3)
}
