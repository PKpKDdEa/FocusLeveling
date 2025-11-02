# FocusLeveling

FocusLeveling is a to-do list and time management app for Android designed to help users prioritize tasks and enhance productivity. The app intelligently suggests tasks based on their priority and the user's available time, and it features an integrated timer to facilitate focused work sessions. Completed tasks are logged in a calendar view, providing a clear and motivating visual record of your progress.

## Features

- **Task Management:** Create, edit, and delete tasks with detailed attributes including title, duration, and priority.
- **Smart Task Suggestions:** The app recommends tasks to work on based on priority and the time you have available.
- **Integrated Timer:** A built-in timer helps you stay focused during work sessions and tracks your time on each task.
- **Progress Calendar:** A calendar view that displays your completed tasks, helping you track your accomplishments over time.
- **Data Persistence:** Tasks are saved in a local Room database, ensuring your data is always available.

## Tech Stack

- **UI:** Jetpack Compose for a modern, declarative UI.
- **Architecture:** MVVM (Model-View-ViewModel) for a clean and scalable architecture.
- **Asynchronous Programming:** Kotlin Coroutines and Flow for managing background threads and handling data streams.
- **Database:** Room for robust and efficient local data storage.
- **Dependency Injection:** Hilt for managing dependencies and simplifying the app's structure.
- **Navigation:** Jetpack Navigation for Compose to handle in-app navigation.
- **Language:** 100% Kotlin.

## Project Structure

- `app/src/main/java/comp3330/focusleveling/`: Main package root.
- `data/`: Contains the data layer components, including the Room database, DAO, and repository.
    - `AppDatabase.kt`: The Room database definition.
    - `Task.kt`: The data model and Room entity for a task.
    - `TaskDao.kt`: Data Access Object for performing database operations on tasks.
    - `TaskRepository.kt`: Repository that abstracts data access from the rest of the app.
- `ui/`: Contains UI-related classes, including Composable screens and ViewModels.
    - `screens/`: Composable functions for each screen of the app (e.g., `HomeScreen`, `AddTaskScreen`).
    - `AppNavHost.kt`: Manages navigation between the different screens.
    - `TaskViewModel.kt`: The ViewModel responsible for holding and processing UI-related data.
- `FocusLevelingApplication.kt`: The application class, used for initializing the database and repository.

## Setup

1.  Clone this repository.
2.  Open the project in Android Studio.
3.  Allow Android Studio to download the necessary Gradle dependencies.
4.  Build and run the app on an Android emulator or a physical device.
