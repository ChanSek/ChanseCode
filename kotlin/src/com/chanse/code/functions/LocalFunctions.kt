package com.chanse.code.functions

fun login(username: String, password: String) {
    fun validate(input: String) = input.length in 6..20

    if (validate(username) && validate(password)) Api.login(username, password)
    else println("Invalid input")
}

object Api {
    fun login(username: String, password: String) {
        // Ignore for Demo
    }
}

fun main() {
    login("Chanse", "Chanse Code")
}
