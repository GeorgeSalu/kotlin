package br.com.rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StartupApp

fun main(args: Array<String>) {
	runApplication<StartupApp>(*args)
}
