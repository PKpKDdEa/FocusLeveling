package com.group14.focusleveling.data.repository

import com.group14.focusleveling.data.dao.TaskDao
import com.group14.focusleveling.data.model.Task

class TaskRepository(private val taskDao: TaskDao) {
    val activeTasks = taskDao.getActiveTasks()
    val completedTasks = taskDao.getCompletedTasks()

    suspend fun logTask(task: Task): Long {
        return taskDao.insert(task)
    }

    suspend fun completeTask(task: Task, actualMinutes: Int) {
        val completed = task.copy(
            completed = true,
            actualMinutes = actualMinutes
        )
        taskDao.update(completed)
    }
}