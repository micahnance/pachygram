package com.pachygram.app

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello from Pachygram!"
    }
}
