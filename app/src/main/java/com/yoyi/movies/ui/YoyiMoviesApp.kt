package com.yoyi.movies.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.yoyi.movies.ui.theme.YoyiMoviesTheme

@Composable
fun YoyiMoviesApp(content: @Composable () -> Unit) {
    YoyiMoviesTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colorScheme.surface) {
            content()
        }
    }
}