package com.yoyi.movies.ui.theme

import androidx.compose.ui.graphics.Color

// Define color values
val Blue = Color(0xFF0296E5)
val White = Color(0xFFFFFFFF)
val DarkGray = Color(0xFF3A3F47)
val Orange = Color(0xFFFF8700)
val Black = Color(0xFF242A32)
val LightGray = Color(0xFFEEEEEE)
val MediumGray = Color(0xCC67686D)
val SemiTransparentBlack = Color(0x4E252836)
val ErrorRed = Color(0xFFCF6679)

// New color definitions for light theme
val LightBlue = Color(0xFF03A9F4)
val VeryLightGray = Color(0xFFF5F5F5)
val DarkOrange = Color(0xFFF57C00)
val DarkErrorRed = Color(0xFFB00020)

// Custom colors for light theme
object CustomColors {

    val SemiTransparentWhite = Color(0x80FFFFFF)
    val SubtleDivider = Color(0x1FFFFFFF)
    val RatingYellow = Orange

    private val SearchBackgroundDark = DarkGray
    private val SearchBackgroundLight = LightGray
    private val InactiveIconDark = Color(0x80FFFFFF)
    private val InactiveIconLight = Color(0x80000000)
    private val DividerDark = Color(0x1FFFFFFF)
    private val DividerLight = Color(0x1F000000)

    // Function to get appropriate color based on theme
    fun getSearchBackground(isDarkTheme: Boolean) =
        if (isDarkTheme) SearchBackgroundDark else SearchBackgroundLight

    fun getInactiveIcon(isDarkTheme: Boolean) =
        if (isDarkTheme) InactiveIconDark else InactiveIconLight

    fun getDivider(isDarkTheme: Boolean) =
        if (isDarkTheme) DividerDark else DividerLight
}