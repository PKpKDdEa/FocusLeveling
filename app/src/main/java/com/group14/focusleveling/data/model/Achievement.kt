package com.group14.focusleveling.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "achievements")
data class Achievement(
    @PrimaryKey
    val code: String, // e.g., "midnight_grinder"

    val title: String,
    val description: String,
    val unlockedAt: Long? = null
)