package com.pdpano.marvelheroes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MarvelHeroesApplication

fun main(args: Array<String>) {
	runApplication<MarvelHeroesApplication>(*args)
}
