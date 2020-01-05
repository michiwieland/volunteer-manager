package ch.openairmalans.volunteermanager.model

import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.annotation.CreatedDate
import java.io.Serializable
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.CreatedBy

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class AuditBase : Serializable {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", updatable = false)
    @CreatedDate
    var createdAt: Date? = null

    @Column(name = "created_by", updatable = false)
    @CreatedBy
    var createdBy: String? = null

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    @LastModifiedDate
    var modifiedAt: Date? = null

    @Column(name = "modified_by")
    @LastModifiedBy
    var modifiedBy: String? = null
}