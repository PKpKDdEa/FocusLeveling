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
import comp3330.focusleveling.model.Task
import com.comp3330.focusleveling.ui.TaskViewModel
import kotlinx.coroutines.delay

@Composable
fun WorkSessionScreen(navController: NavHostController, vm: TaskViewModel) {
    val tasks by vm.tasks.collectAsState()
    var available by remember { mutableStateOf("") }
    var selected by remember { mutableStateOf<Task?>(null) }
    var timeLeft by remember { mutableStateOf(0L) }
    var isRunning by remember { mutableStateOf(false) }

    if (selected == null) {
        Column(Modifier.padding(16.dp)) {
            Text("How long do you want to work? (minutes)")
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(value = available, onValueChange = { available = it }, label = { Text("Minutes") })
            Spacer(Modifier.height(12.dp))
            Button(onClick = {
                val avail = available.toIntOrNull() ?: 60
                selected = selectBestTask(tasks, avail)
                selected?.let {
                    timeLeft = (minOf(avail, it.durationMinutes) * 60).toLong()
                    isRunning = true
                }
            }) {
                Text("Find Task")
            }
        }
    } else {
        // Timer UI
        Column(Modifier.padding(16.dp)) {
            Text("Task: ${selected!!.title}")
            Text("Time left: ${timeLeft / 60}m ${timeLeft % 60}s")
            Spacer(Modifier.height(8.dp))
            Button(onClick = {
                // finish early
                vm.completeTask(selected!!)
                navController.popBackStack()
            }) { Text("Finish and Log") }

            LaunchedEffect(isRunning, timeLeft) {
                if (isRunning && timeLeft > 0) {
                    delay(1_000)
                    timeLeft--
                } else if (timeLeft == 0L && isRunning) {
                    // on complete
                    vm.completeTask(selected!!)
                    navController.popBackStack()
                }
            }
        }
    }
}

fun selectBestTask(tasks: List<Task>, availableMinutes: Int): Task? {
    return tasks.filter { !it.isCompleted && it.durationMinutes <= availableMinutes }
        .maxByOrNull { it.priority.toDouble() / it.durationMinutes }
}
