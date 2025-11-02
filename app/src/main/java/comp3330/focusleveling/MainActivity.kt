package com.comp3330.focusleveling

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.comp3330.focusleveling.ui.AppNavHost
import com.comp3330.focusleveling.ui.theme.FocusLevelingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FocusLevelingTheme {
                AppNavHost()
            }
        }
    }
}
