package com.github.amrmsaraya.clock.feature_clock.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "clock")
data class ClockDTO(
    @PrimaryKey
    val id: String,
    val displayName: String
)
