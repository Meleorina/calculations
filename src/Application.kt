package com.apmath.calculations

import com.apmath.calculations.application.v1.v1
import io.ktor.application.*
import io.ktor.routing.*
import io.ktor.locations.*
import io.ktor.features.*
import io.ktor.gson.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    install(Locations) {
    }

    install(DefaultHeaders) {
    }

    install(ContentNegotiation) {
        gson {
        }
    }

    install(Routing) {
        // append routing from application here
        v1()
    }
}
