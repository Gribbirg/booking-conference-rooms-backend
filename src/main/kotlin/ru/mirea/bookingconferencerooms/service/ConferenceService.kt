package ru.mirea.bookingconferencerooms.service

import org.springframework.stereotype.Service
import ru.mirea.bookingconferencerooms.models.Conference
import ru.mirea.bookingconferencerooms.models.dto.ConferenceInput
import ru.mirea.bookingconferencerooms.repository.ConferenceRepository
import java.util.*

@Service
class ConferenceService(
    private val conferenceRepository: ConferenceRepository,
) {
    fun getAll(): List<Conference> {
        return conferenceRepository.findAll()
    }

    fun getByRoomId(roomId: UUID): List<Conference> {
        return conferenceRepository.findAllByRoomId(roomId)
    }

    fun addConference(conference: ConferenceInput): Conference? {
        return conferenceRepository.save(conference.toEntity())
    }

    private fun ConferenceInput.toEntity(): Conference {
        return Conference(
            roomId = roomId,
            name = name,
            authorId = authorId,
            startTime = startTime,
            endTime = endTime,
        )
    }
}