package com.pdpano.marvelheroes.clients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("marvel", url = "http://gateway.marvel.com/")
interface MarvelClient {

    @RequestMapping(method = [RequestMethod.GET], value = ["v1/public/comics?ts=60000&apikey=98fab3ee0019e1c0cded226cc810a267&hash=97e82a1195f4784ea17accc7f3e2fffa"])
    fun getCharacters(): Any
}