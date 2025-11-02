package com.comp3330.focusleveling.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.comp3330.focusleveling.model.Task
import com.comp3330.focusleveling.ui.TaskViewModel

@Composable
fun EditTaskScreen(navController: NavHostController, vm: TaskViewModel, taskId: Long) {
    val task = vm.tasks.collectAsState().value.find { it.id == taskId }
    if (task == null) {
        Text("Task not found")
        return
    }

    var title by remember { mutableStateOf(task.title) }
    var duration by remember { mutableStateOf(task.durationMinutes.toString()) }
    var priority by remember { mutableStateOf(task.priority.toString()) }

    Column(Modifier.padding(16.dp)) {
        Text("Edit Task")
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(value = title, onValueChange = { title = it }, label = { Text("Title") })
        OutlinedTextField(value = duration, onValueChange = { duration = it }, label = { Text("Duration (min)") })
        OutlinedTextField(value = priority, onValueChange = { priority = it }, label = { Text("Priority (1-5)") })
        Spacer(Modifier.height(12.dp))
        Button(onClick = {
            val updatedTask = task.copy(
                title = title,
                durationMinutes = duration.toIntOrNull() ?: task.durationMinutes,
                priority = priority.toIntOrNull() ?: task.priority
            )
            vm.updateTask(updatedTask)
            navController.popBackStack()
        }) {
            Text("Update")
        }
    }
}
