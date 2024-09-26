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
import com.yoyi.movies.models.MediaItem
import com.yoyi.movies.models.getMedia
import com.yoyi.movies.ui.screens.shared.Thumb
import com.yoyi.movies.ui.theme.Dimens

@Composable
fun MediaList(onClick: (MediaItem) -> Unit, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(Dimens.xSmall.padding),
        modifier = modifier
    ) {
        items(getMedia()) { item ->
            MediaListItem(
                onClick = { onClick(item) },
                item = item,
                modifier = Modifier.padding(Dimens.small.padding)
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
        elevation = cardElevation(Dimens.small.default),
        border = BorderStroke(Dimens.xSmall.default, MaterialTheme.colorScheme.onPrimaryContainer),
        colors = cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
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
            .padding(Dimens.large.padding)
    ) {
        Text(
            text = item.title,
            color = MaterialTheme.colorScheme.onPrimary,
            style = MaterialTheme.typography.headlineSmall
        )
    }
}