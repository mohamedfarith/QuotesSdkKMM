package com.learning.quotessdkkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform