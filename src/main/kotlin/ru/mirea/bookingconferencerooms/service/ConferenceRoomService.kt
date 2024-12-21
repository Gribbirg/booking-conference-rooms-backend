package ru.mirea.bookingconferencerooms.service

import org.springframework.stereotype.Service
import ru.mirea.bookingconferencerooms.models.ConferenceRoom
import ru.mirea.bookingconferencerooms.repository.ConferenceRoomRepository
import java.util.*

@Service
class ConferenceRoomService(
    private val conferenceRoomRepository: ConferenceRoomRepository,
) {
    fun getAll(): List<ConferenceRoom> {
        return conferenceRoomRepository.findAll()
    }

    fun getById(id: UUID): ConferenceRoom {
        return conferenceRoomRepository.findById(id).get()
    }
}