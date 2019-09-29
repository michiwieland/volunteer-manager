package ch.openairmalans.volunteermanager.model

import org.springframework.data.jpa.domain.support.AuditingEntityListener
import javax.persistence.*


@Entity
@EntityListeners(AuditingEntityListener::class)
class Volunteer  (
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,
        var firstName: String ="",
        var lastName: String ="",
        var email: String = "",
        var mobile: String = ""
) : AuditBase()
