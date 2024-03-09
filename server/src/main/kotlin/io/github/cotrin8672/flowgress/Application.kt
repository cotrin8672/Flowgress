package io.github.cotrin8672.flowgress

import Greeting
import SERVER_PORT
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = SERVER_PORT, host = "0.0.0.0", watchPaths = listOf("classes", "resources")) {
        module()
    }.start(wait = true)
}

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Ktor & Compose multiplatform: ${Greeting().greet()}")
        }
    }
}
