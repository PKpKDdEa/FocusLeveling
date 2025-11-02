package com.comp3330.focusleveling.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.comp3330.focusleveling.FocusLevelingApplication
import com.comp3330.focusleveling.ui.screens.AddTaskScreen
import com.comp3330.focusleveling.ui.screens.CalendarScreen
import com.comp3330.focusleveling.ui.screens.EditTaskScreen
import com.comp3330.focusleveling.ui.screens.HomeScreen
import com.comp3330.focusleveling.ui.screens.WorkSessionScreen

@Composable
fun AppNavHost() {
    val nav = rememberNavController()
    val application = LocalContext.current.applicationContext as FocusLevelingApplication
    val vm: TaskViewModel = viewModel(factory = TaskViewModelFactory(application.repository))
    NavHost(navController = nav, startDestination = "home") {
        composable("home") { HomeScreen(navController = nav, vm = vm) }
        composable("add") { AddTaskScreen(navController = nav, vm = vm) }
        composable("session") { WorkSessionScreen(navController = nav, vm = vm) }
        composable("calendar") { CalendarScreen(navController = nav, vm = vm) }
        composable(
            "edit/{taskId}",
            arguments = listOf(navArgument("taskId") { type = NavType.LongType })
        ) { backStackEntry ->
            val taskId = backStackEntry.arguments?.getLong("taskId")
            if (taskId != null) {
                EditTaskScreen(navController = nav, vm = vm, taskId = taskId)
            }
        }
    }
}
