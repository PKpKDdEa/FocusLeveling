package com.comp3330.focusleveling.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.comp3330.focusleveling.ui.TaskViewModel
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun CalendarScreen(navController: NavHostController, vm: TaskViewModel) {
    val tasks = vm.tasks.collectAsState().value
    val completed = tasks.filter { it.isCompleted && it.completedAt != null }
    val groupedByDate = completed.groupBy {
        val cal = Calendar.getInstance()
        cal.timeInMillis = it.completedAt!!
        cal.get(Calendar.YEAR) * 10000 + cal.get(Calendar.MONTH) * 100 + cal.get(Calendar.DAY_OF_MONTH)
    }

    Column(Modifier.padding(16.dp)) {
        Text("Progress Calendar", style = MaterialTheme.typography.h5)
        LazyColumn {
            groupedByDate.forEach { (date, tasksOnDate) ->
                item {
                    val df = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                    val formattedDate = df.format(tasksOnDate.first().completedAt!!)
                    Text(formattedDate, style = MaterialTheme.typography.h6, modifier = Modifier.padding(vertical = 8.dp))
                }
                items(tasksOnDate) { t ->
                    Text("  • ${t.title} (${t.durationMinutes} min)")
                }
            }
        }
    }
}
