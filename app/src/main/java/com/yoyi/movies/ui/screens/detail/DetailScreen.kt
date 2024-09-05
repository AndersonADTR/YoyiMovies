package com.yoyi.movies.ui.screens.detail

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yoyi.movies.models.getMedia
import com.yoyi.movies.ui.YoyiMoviesApp
import com.yoyi.movies.ui.screens.main.MainAppBar
import com.yoyi.movies.ui.screens.shared.Thumb

@Composable
fun DetailScreen(mediaId: Int, onUpClick: () -> Unit) {

    YoyiMoviesApp {
        Scaffold(
            topBar = {
                MainAppBar(
                    onUpClick = onUpClick,
                    title = "Detail Screen $mediaId"
                )
            }
        ) { paddingValues ->
            val item = getMedia().first { it.id == mediaId }
            Thumb(
                mediaItem = item,
                modifier = Modifier.padding(paddingValues)
            )
        }
    }
}