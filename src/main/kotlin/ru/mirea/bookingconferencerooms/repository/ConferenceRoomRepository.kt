package ru.mirea.bookingconferencerooms.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.mirea.bookingconferencerooms.models.ConferenceRoom
import java.util.*

@Repository
interface ConferenceRoomRepository : JpaRepository<ConferenceRoom, UUID>
