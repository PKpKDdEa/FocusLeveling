package com.comp3330.focusleveling.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.comp3330.focusleveling.ui.TaskViewModel

@Composable
fun AddTaskScreen(navController: NavHostController, vm: TaskViewModel) {
    var title = remember { mutableStateOf("") }
    var duration = remember { mutableStateOf("") }
    var priority = remember { mutableStateOf("") }

    Column(Modifier.padding(16.dp)) {
        Text("Add Task")
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(value = title.value, onValueChange = { title.value = it }, label = { Text("Title") })
        OutlinedTextField(value = duration.value, onValueChange = { duration.value = it }, label = { Text("Duration (min)") })
        OutlinedTextField(value = priority.value, onValueChange = { priority.value = it }, label = { Text("Priority (1-5)") })
        Spacer(Modifier.height(12.dp))
        Button(onClick = {
            vm.addTask(title.value, duration.value.toIntOrNull() ?: 30, priority.value.toIntOrNull() ?: 3)
            navController.popBackStack()
        }) {
            Text("Save")
        }
    }
}
