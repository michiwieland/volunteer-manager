package ch.openairmalans.volunteermanager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class VolunteerManagerApplication

fun main(args: Array<String>) {
	runApplication<VolunteerManagerApplication>(*args)
}
