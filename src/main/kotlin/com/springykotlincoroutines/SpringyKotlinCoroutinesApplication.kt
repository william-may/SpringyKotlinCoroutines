package com.springykotlincoroutines

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
class SpringyKotlinCoroutinesApplication

fun main(args: Array<String>) {
    runApplication<SpringyKotlinCoroutinesApplication>(*args)
}
