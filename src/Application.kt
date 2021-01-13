package com.polish.io

import io.ktor.application.*
import io.ktor.http.HttpHeaders.ContentType
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    routing {
        /**
         * to add a route
         * add a get request,
         * add a path,
         * add a response
         */
        get("/"){
            /**
             * here is the response
             */
            call.respondText("Welcome to API building with ktor", io.ktor.http.ContentType.Text.Plain)
        }

        post("/"){
            val post = call.receive<String>()
            call.respondText("Received $post from the post body", io.ktor.http.ContentType.Text.Plain)
        }
    }
}

