package ru.mirea.bookingconferencerooms.models

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "conference_rooms")
data class ConferenceRoom(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: UUID = UUID.randomUUID(),
    val name: String = "",
    val floor: Int = 0,
    @Column(name = "max_people")
    val maxPeople: Int = 0,
)
