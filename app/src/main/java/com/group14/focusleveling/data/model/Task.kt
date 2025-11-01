package com.group14.focusleveling.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val title: String,
    val type: String = "custom", // preset or custom
    val difficulty: Int = 1,     // 1-5
    val estimatedMinutes: Int = 30,
    val actualMinutes: Int = 0,
    val deadline: Long? = null,  // timestamp
    val loggedAt: Long = System.currentTimeMillis(),
    val completed: Boolean = false
)