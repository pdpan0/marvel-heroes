package com.pdpano.marvelheroes.clients

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MarvelController(private val client: MarvelClient) {

    @GetMapping()
    fun requestMarvel(): Any {
        println("Started call")
        val result = client.getCharacters()
        println("End call")
        return result
    }
}