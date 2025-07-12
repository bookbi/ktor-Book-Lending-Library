package com.example.ktor

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import com.example.ktor.routes.registerBookRoutes
import com.example.ktor.routes.registerLendingRoutes

fun main() {
    embeddedServer(Netty, port = 8080) {
        module()
    }.start(wait = true)
}

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    val repository = LibraryRepository()
    val service = LibraryService(repository)
    registerBookRoutes(service)
    registerLendingRoutes(service)
}
