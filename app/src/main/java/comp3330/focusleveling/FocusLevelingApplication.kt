package com.comp3330.focusleveling

import android.app.Application
import com.comp3330.focusleveling.data.AppDatabase
import com.comp3330.focusleveling.data.TaskRepository

class FocusLevelingApplication : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { TaskRepository(database.taskDao()) }
}
