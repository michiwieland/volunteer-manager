package ch.openairmalans.volunteermanager.service

import ch.openairmalans.volunteermanager.model.Volunteer
import org.springframework.data.repository.CrudRepository

interface VolunteerService : CrudRepository<Volunteer, Long> {

}