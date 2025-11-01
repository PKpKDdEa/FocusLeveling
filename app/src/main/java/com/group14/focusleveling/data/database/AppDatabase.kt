package com.group14.focusleveling.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.group14.focusleveling.data.dao.AchievementDao
import com.group14.focusleveling.data.dao.TaskDao
import com.group14.focusleveling.data.dao.UserProfileDao
import com.group14.focusleveling.data.model.Task
import com.group14.focusleveling.data.model.UserProfile
import com.group14.focusleveling.data.model.Achievement
import com.group14.focusleveling.data.Converters


@Database(
    entities = [Task::class, UserProfile::class, Achievement::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
    abstract fun userProfileDao(): UserProfileDao
    abstract fun achievementDao(): AchievementDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "focus_leveling.db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}