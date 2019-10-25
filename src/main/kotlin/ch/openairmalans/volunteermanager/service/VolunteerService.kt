package ch.openairmalans.volunteermanager.service

import ch.openairmalans.volunteermanager.model.Volunteer
import org.springframework.data.jpa.datatables.repository.DataTablesRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface VolunteerService : DataTablesRepository<Volunteer, Long> {

}