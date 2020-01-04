package com.chanse.code.misc

class User(var name: String, var email: String) {
    operator fun component1() = name
    operator fun component2() = email
    operator fun component3() = name.length
    operator fun component4() = email.length
}

fun getUser() = User("Chanse Code", "<something>@gmail.com")

fun main() {
    val user = getUser()
    val name = user.name
    val email = user.email
    println("Name - $name\nEmail - $email")

    val (n, e) = getUser()
    println("Name - $n\nEmail - $e")

    val (a, _) = getUser()
    println("Name - $a")

    val (n1, e1, nameLen, emailLen) = getUser()
    println("Name Length - $nameLen\nEmail Length - $emailLen")

    val map = hashMapOf("A" to "Apple", "B" to "Ball", "C" to "Cat")
    map.forEach { (k, v) ->
        println("$k - $v")
    }
}
