package ch.openairmalans.volunteermanager.model

import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank


@Entity
@EntityListeners(AuditingEntityListener::class)
data class Volunteer(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,

        @get: NotBlank
        val firstName: String,

        @get: NotBlank
        val lastName: String,

        @get: NotBlank
        val email: String,

        @get: NotBlank
        val mobile: String,

        @get: NotBlank
        val gender: UUID,

        val tshirtSize : UUID,

        @get: NotBlank
        val clubMember : Boolean = false

) : AuditBase()
