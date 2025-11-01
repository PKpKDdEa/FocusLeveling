package com.group14.focusleveling

import android.app.Application
import com.group14.focusleveling.data.database.AppDatabase

class FocusLevelingApp : Application() {
    lateinit var database: AppDatabase

    override fun onCreate() {
        super.onCreate()
        database = AppDatabase.getDatabase(this)
    }
}