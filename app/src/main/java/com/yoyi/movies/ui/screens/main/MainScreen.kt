package com.yoyi.movies.ui.screens.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yoyi.movies.ui.YoyiMoviesApp

@Composable
fun MainScreen(onNavigate: (Int) -> Unit) {
    YoyiMoviesApp {
        Scaffold(
            topBar = { MainAppBar(isMainScreen = true) }
        ) { paddingValues ->
            MediaList(
                onClick = { mediaItem -> onNavigate(mediaItem.id) },
                modifier = Modifier.padding(paddingValues)
            )
        }
    }
}