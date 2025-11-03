package com.comp3330.focusleveling.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import comp3330.focusleveling.model.Task
import com.comp3330.focusleveling.ui.TaskViewModel
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

@Composable
fun HomeScreen(navController: NavHostController, vm: TaskViewModel) {
    val tasks = vm.tasks.collectAsState().value

    Scaffold(floatingActionButton = {
        Button(onClick = { navController.navigate("add") }) { Text("+ Add") }
    }) { padding ->
        Column(Modifier.padding(padding).padding(16.dp)) {
            Text("FocusLeveling", style = androidx.compose.material.MaterialTheme.typography.h5)
            Spacer(Modifier.height(12.dp))
            Button(onClick = { navController.navigate("session") }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("Start Working")
            }
            Spacer(Modifier.height(12.dp))
            Text("Your Tasks:")
            Spacer(Modifier.height(8.dp))
            LazyColumn {
                items(tasks) { t: Task ->
                    Row(
                        Modifier.fillMaxWidth().padding(8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(checked = t.isCompleted, onCheckedChange = {
                            if (!t.isCompleted) vm.completeTask(t)
                        })
                        Column(modifier = Modifier.weight(1f).padding(start = 8.dp)) {
                            Text(t.title)
                            Text("${t.durationMinutes} min · P${t.priority}")
                        }
                        IconButton(onClick = { navController.navigate("edit/${t.id}") }) {
                            Icon(Icons.Default.Edit, contentDescription = "Edit Task")
                        }
                        IconButton(onClick = { vm.deleteTask(t) }) {
                            Icon(Icons.Default.Delete, contentDescription = "Delete Task")
                        }
                    }
                }
            }
            Spacer(Modifier.height(12.dp))
            Button(onClick = { navController.navigate("calendar") }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("Progress Calendar")
            }
        }
    }
}
