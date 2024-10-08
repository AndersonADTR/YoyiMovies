package com.yoyi.movies.ui.screens.shared

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.yoyi.movies.models.MediaItem
import com.yoyi.movies.ui.theme.Dimens

@Composable
fun Thumb(mediaItem: MediaItem, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .height(Dimens.large.cardHeight)
            .fillMaxWidth()
    ) {
        AsyncImage(
            model = mediaItem.thumb,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        if (mediaItem.type == MediaItem.Type.VIDEO) {
            Icon(
                Icons.Default.PlayCircleOutline,
                contentDescription = null,
                modifier = Modifier
                    .size(Dimens.xLarge.icon)
                    .align(Alignment.Center),
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}