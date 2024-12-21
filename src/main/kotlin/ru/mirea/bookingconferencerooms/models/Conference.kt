package ru.mirea.bookingconferencerooms.models

import jakarta.persistence.*
import java.time.OffsetDateTime
import java.util.*

@Entity
@Table(name = "conferences")
data class Conference(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: UUID = UUID.randomUUID(),
    val name: String = "",
    @Column(name = "author_id")
    val authorId: String = "",
    @Column(name = "start_time")
    val startTime: OffsetDateTime = OffsetDateTime.now(),
    @Column(name = "end_time")
    val endTime: OffsetDateTime = OffsetDateTime.now().plusMinutes(30),
    @Column(name = "room_id")
    val roomId: UUID = UUID.randomUUID(),
)
