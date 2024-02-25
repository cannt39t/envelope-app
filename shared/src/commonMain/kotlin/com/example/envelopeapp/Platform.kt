package com.example.envelopeapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform