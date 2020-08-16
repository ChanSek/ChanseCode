package com.chanse.code.delegation

val lazyValue by lazy {
    println("Evaluated!!!")
    "Hello"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
}
