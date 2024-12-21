package ru.mirea.bookingconferencerooms.controller

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller
import ru.mirea.bookingconferencerooms.models.Conference
import ru.mirea.bookingconferencerooms.models.ConferenceRoom
import ru.mirea.bookingconferencerooms.models.dto.ConferenceInput
import ru.mirea.bookingconferencerooms.service.ConferenceRoomService
import ru.mirea.bookingconferencerooms.service.ConferenceService
import java.util.UUID

@Controller
class ConferenceController(
    private val conferenceService: ConferenceService,
    private val conferenceRoomService: ConferenceRoomService,
) {
    @QueryMapping("conferences")
    fun getConferences(): List<Conference> {
        return conferenceService.getAll()
    }

    @QueryMapping("conferencesByRoom")
    fun getConferencesByRoom(@Argument roomId: UUID): List<Conference> {
        return conferenceService.getByRoomId(roomId)
    }

    @MutationMapping("addConference")
    fun addConference(@Argument conference: ConferenceInput): Conference? {
        return conferenceService.addConference(conference)
    }


    @SchemaMapping(typeName = "Conference", field = "room")
    fun getRoom(conference: Conference): ConferenceRoom {
        return conferenceRoomService.getById(conference.roomId)
    }
}