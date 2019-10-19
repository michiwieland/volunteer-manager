package ch.openairmalans.volunteermanager.service

import ch.openairmalans.volunteermanager.model.Volunteer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface VolunteerService : CrudRepository<Volunteer, Long> {

}