package com.group14.focusleveling.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.group14.focusleveling.data.model.Task
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Insert
    suspend fun insert(task: Task): Long

    @Update
    suspend fun update(task: Task)

    @Query("SELECT * FROM tasks WHERE completed = 0 ORDER BY deadline ASC")
    fun getActiveTasks(): Flow<List<Task>>

    @Query("SELECT * FROM tasks WHERE completed = 1")
    fun getCompletedTasks(): Flow<List<Task>>

    @Query("SELECT SUM(actualMinutes) FROM tasks WHERE completed = 1")
    fun getTotalStudyMinutes(): Flow<Int?>
}