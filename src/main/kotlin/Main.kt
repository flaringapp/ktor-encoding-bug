package com.flaringapp

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.compression.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.runBlocking

fun main() {
    val client = createHttpClient()

    runBlocking {
        test(client)
    }
}

private suspend fun test(client: HttpClient) {
    val response = client.get("https://google.com")

    response.bodyAsText()
    response.bodyAsText()
}

private fun createHttpClient() = HttpClient(CIO) {
    install(ContentEncoding) {
        gzip()
    }
}
