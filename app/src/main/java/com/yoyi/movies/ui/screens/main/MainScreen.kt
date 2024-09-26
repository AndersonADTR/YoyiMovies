package com.yoyi.movies.ui.screens.main

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MainScreenPreview() {
    MainScreen(onNavigate = {})
}