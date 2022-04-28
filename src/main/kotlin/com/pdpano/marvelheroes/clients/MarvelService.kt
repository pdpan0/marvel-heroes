package com.pdpano.marvelheroes.clients

import org.springframework.stereotype.Service

@Service
class MarvelService(private val marvelClient: MarvelClient) {

    fun getCharacters(): Any {
        return marvelClient.getCharacters()
    }
}