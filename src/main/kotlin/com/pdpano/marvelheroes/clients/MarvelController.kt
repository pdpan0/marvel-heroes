package com.pdpano.marvelheroes.clients

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MarvelController(private val service: MarvelService) {

    @GetMapping()
    fun requestMarvel(): Any {
        return service.getCharacters()
    }
}