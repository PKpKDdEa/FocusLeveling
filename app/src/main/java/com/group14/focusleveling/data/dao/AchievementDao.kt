package com.group14.focusleveling.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.group14.focusleveling.data.model.Achievement
import kotlinx.coroutines.flow.Flow

@Dao
interface AchievementDao {
    @Insert
    suspend fun unlock(achievement: Achievement)

    @Query("SELECT * FROM achievements WHERE unlockedAt IS NOT NULL")
    fun getUnlocked(): Flow<List<Achievement>>
}