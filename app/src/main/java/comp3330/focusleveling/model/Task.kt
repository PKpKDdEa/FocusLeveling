package comp3330.focusleveling.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String = "",
    val durationMinutes: Int = 30,
    val priority: Int = 3,
    val isCompleted: Boolean = false,
    val completedAt: Long? = null
)
