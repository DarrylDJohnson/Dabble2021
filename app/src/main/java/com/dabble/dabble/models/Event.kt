package com.dabble.dabble.models

import java.util.*

data class Event(
    val id: String,
    val title: String,
    val subtitle: String,
    val description: String,
    val dateTime: Date
)