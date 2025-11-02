package com.comp3330.focusleveling.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.comp3330.focusleveling.data.TaskRepository
import com.comp3330.focusleveling.model.Task
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class TaskViewModel(private val repository: TaskRepository) : ViewModel() {
    val tasks: StateFlow<List<Task>> = repository.allTasks.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    fun addTask(title: String, duration: Int, priority: Int) {
        val t = Task(title = title, durationMinutes = duration, priority = priority)
        viewModelScope.launch {
            repository.insert(t)
        }
    }

    fun updateTask(task: Task) {
        viewModelScope.launch {
            repository.update(task)
        }
    }

    fun completeTask(task: Task) {
        val updatedTask = task.copy(isCompleted = true, completedAt = System.currentTimeMillis())
        viewModelScope.launch {
            repository.update(updatedTask)
        }
    }

    fun deleteTask(task: Task) {
        viewModelScope.launch {
            repository.delete(task)
        }
    }
}
