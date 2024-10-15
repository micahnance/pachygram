package com.pachygram.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform