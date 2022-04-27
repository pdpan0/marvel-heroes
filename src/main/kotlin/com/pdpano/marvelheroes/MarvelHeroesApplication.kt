package com.pdpano.marvelheroes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class MarvelHeroesApplication

fun main(args: Array<String>) {
	runApplication<MarvelHeroesApplication>(*args)
}