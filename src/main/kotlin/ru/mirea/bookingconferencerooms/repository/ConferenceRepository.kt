package ru.mirea.bookingconferencerooms.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.mirea.bookingconferencerooms.models.Conference
import java.util.*

@Repository
interface ConferenceRepository : JpaRepository<Conference, UUID> {
    fun findAllByRoomId(roomId: UUID): List<Conference>
}