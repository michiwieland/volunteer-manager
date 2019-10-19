package ch.openairmalans.volunteermanager

import nz.net.ultraq.thymeleaf.LayoutDialect
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@Configuration
class ThymeleafLayoutConfig {
	@Bean
	fun layoutDialect() = LayoutDialect()
}

@SpringBootApplication
@EnableJpaAuditing
class VolunteerManagerApplication

fun main(args: Array<String>) {
	runApplication<VolunteerManagerApplication>(*args)
}
