package ch.openairmalans.volunteermanager.model

import org.springframework.data.jpa.domain.support.AuditingEntityListener
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@EntityListeners(AuditingEntityListener::class)
data class Registration(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,

        @get: NotBlank
        var shiftagreemenStatusId: Long,

        @get: NotBlank
        var briefingStatusId: Long,

        @get: NotBlank
        var dinnerStatusId: Long,

        @ManyToOne
        @JoinColumn(name = "volunteerId", insertable = false, updatable = false)
        var volunteer: Volunteer

) : AuditBase()