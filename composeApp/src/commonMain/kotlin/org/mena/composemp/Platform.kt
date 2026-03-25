package org.mena.composemp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform