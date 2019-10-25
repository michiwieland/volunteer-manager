package ch.openairmalans.volunteermanager.model

import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull


@Entity
@EntityListeners(AuditingEntityListener::class)
data class Volunteer(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,

        @get: NotBlank
        var firstName: String = "",

        @get: NotBlank
        var lastName: String = "",

        @get: NotBlank
        var email: String = "",

        @get: NotBlank
        var mobile: String = "",

        var birthDate: LocalDate? = null,

        var gender: Long = 0,

        var tshirtSize: Long?,

        var clubMember: Boolean = false

) : AuditBase()
