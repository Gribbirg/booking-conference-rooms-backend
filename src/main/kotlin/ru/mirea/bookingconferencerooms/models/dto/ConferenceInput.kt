package ru.mirea.bookingconferencerooms.models.dto

import java.time.OffsetDateTime
import java.util.*

data class ConferenceInput(
    val name: String = "",
    val authorId: String = "",
    val startTime: OffsetDateTime = OffsetDateTime.now(),
    val endTime: OffsetDateTime = OffsetDateTime.now().plusMinutes(30),
    val roomId: UUID = UUID.randomUUID(),
)