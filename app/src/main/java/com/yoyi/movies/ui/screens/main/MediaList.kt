package com.yoyi.movies.ui.screens.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yoyi.movies.models.MediaItem
import com.yoyi.movies.models.getMedia
import com.yoyi.movies.ui.screens.shared.Thumb

@Composable
fun MediaList(onClick: (MediaItem) -> Unit, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(200.dp),
        contentPadding = PaddingValues(2.dp),
        modifier = modifier
    ) {
        items(getMedia()) { item ->
            MediaListItem(
                onClick = { onClick(item) },
                item = item,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
private fun MediaListItem(
    onClick: () -> Unit,
    item: MediaItem,
    modifier: Modifier = Modifier
) {
    Card (
        modifier = modifier.clickable { onClick() },
        elevation = cardElevation(0.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        colors = cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = Color.DarkGray
        )
    ) {
        Column {
            Thumb(mediaItem = item)
            Title(item = item)
        }
    }
}

@Composable
private fun Title(item: MediaItem) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Transparent)
            .padding(16.dp)
    ) {
        Text(
            text = item.title,
            style = MaterialTheme.typography.headlineSmall
        )
    }
}