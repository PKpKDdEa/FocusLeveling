package com.group14.focusleveling.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.group14.focusleveling.data.model.UserProfile
import kotlinx.coroutines.flow.Flow

@Dao
interface UserProfileDao {
    @Insert(onConflict = OnConflictStrategy.Companion.REPLACE)
    suspend fun insertOrUpdate(profile: UserProfile)

    @Query("SELECT * FROM user_profile WHERE id = 1")
    fun getProfile(): Flow<UserProfile?>

    @Query("UPDATE user_profile SET xp = xp + :xp WHERE id = 1")
    suspend fun addXp(xp: Long)

    @Query("UPDATE user_profile SET health = health - :loss WHERE id = 1")
    suspend fun deductHealth(loss: Int)
}