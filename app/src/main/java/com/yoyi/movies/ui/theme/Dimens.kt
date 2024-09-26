package com.yoyi.movies.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object Dimens {

    val xSmall = BaseDimens(
        default = 2.dp,
        spacing = 2.dp,
        padding = 2.dp,
        icon = 12.dp,
        buttonHeight = 32.dp,
        buttonWidth = 64.dp,
        labelHeight = 20.dp,
        labelWidth = 64.dp,
        cardHeight = 100.dp,
        cardWidth = 150.dp,
        imageHeight = 50.dp,
        imageWidth = 50.dp,
        textViewHeight = 20.dp,
        textViewWidth = 100.dp
    )

    val small = BaseDimens(
        default = 4.dp,
        spacing = 4.dp,
        padding = 4.dp,
        icon = 16.dp,
        buttonHeight = 32.dp,
        buttonWidth = 64.dp,
        labelHeight = 20.dp,
        labelWidth = 64.dp,
        cardHeight = 100.dp,
        cardWidth = 150.dp,
        imageHeight = 50.dp,
        imageWidth = 50.dp,
        textViewHeight = 20.dp,
        textViewWidth = 100.dp
    )

    val medium = BaseDimens(
        default = 8.dp,
        spacing = 8.dp,
        padding = 8.dp,
        icon = 24.dp,
        buttonHeight = 40.dp,
        buttonWidth = 128.dp,
        labelHeight = 24.dp,
        labelWidth = 128.dp,
        cardHeight = 150.dp,
        cardWidth = 200.dp,
        imageHeight = 100.dp,
        imageWidth = 100.dp,
        textViewHeight = 24.dp,
        textViewWidth = 200.dp
    )

    val large = BaseDimens(
        default = 16.dp,
        spacing = 16.dp,
        padding = 16.dp,
        icon = 32.dp,
        buttonHeight = 48.dp,
        buttonWidth = 256.dp,
        labelHeight = 28.dp,
        labelWidth = 256.dp,
        cardHeight = 200.dp,
        cardWidth = 300.dp,
        imageHeight = 150.dp,
        imageWidth = 150.dp,
        textViewHeight = 28.dp,
        textViewWidth = 300.dp
    )

    val xLarge = BaseDimens(
        default = 24.dp,
        spacing = 24.dp,
        padding = 24.dp,
        icon = 40.dp,
        buttonHeight = 48.dp,
        buttonWidth = 256.dp,
        labelHeight = 28.dp,
        labelWidth = 256.dp,
        cardHeight = 200.dp,
        cardWidth = 300.dp,
        imageHeight = 150.dp,
        imageWidth = 150.dp,
        textViewHeight = 28.dp,
        textViewWidth = 300.dp
    )

    data class BaseDimens(
        val default: Dp,
        val spacing: Dp,
        val padding: Dp,
        val icon: Dp,
        val buttonHeight: Dp,
        val buttonWidth: Dp,
        val labelHeight: Dp,
        val labelWidth: Dp,
        val cardHeight: Dp,
        val cardWidth: Dp,
        val imageHeight: Dp,
        val imageWidth: Dp,
        val textViewHeight: Dp,
        val textViewWidth: Dp
    )
}