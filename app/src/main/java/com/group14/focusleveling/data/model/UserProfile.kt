package com.group14.focusleveling.data.model

import androidx.room.Entity
import androidx.room.Fts4
import androidx.room.PrimaryKey

@Entity(tableName = "user_profile")
@Fts4 // Optional: Full-text search later
data class UserProfile(
    @PrimaryKey
    val id: Int = 1, // Singleton

    val level: Int = 1,
    val xp: Long = 0,
    val health: Int = 100,
    val streakDays: Int = 0,
    val lastActiveDate: Long = 0,
    val avatarUrl: String = ""
)