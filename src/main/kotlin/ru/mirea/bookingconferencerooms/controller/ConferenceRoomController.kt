package ru.mirea.bookingconferencerooms.controller

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import ru.mirea.bookingconferencerooms.models.ConferenceRoom
import ru.mirea.bookingconferencerooms.service.ConferenceRoomService
import java.util.UUID

@Controller
class ConferenceRoomController(
    private val conferenceRoomService: ConferenceRoomService,
) {
    @QueryMapping("conferenceRooms")
    fun getConferenceRooms(): List<ConferenceRoom> {
        return conferenceRoomService.getAll()
    }

    @QueryMapping("conferenceRoom")
    fun getConferenceRoom(@Argument roomId: UUID): ConferenceRoom {
        return conferenceRoomService.getById(roomId)
    }
}