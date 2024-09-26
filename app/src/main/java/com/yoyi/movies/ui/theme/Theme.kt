package com.yoyi.movies.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

// Color scheme
private val DarkColorScheme = darkColorScheme(
    primary = Blue,
    onPrimary = White,
    primaryContainer = DarkGray,
    onPrimaryContainer = White,
    secondary = Orange,
    onSecondary = Black,
    tertiary = LightGray,
    onTertiary = Black,
    background = Black,
    onBackground = White,
    surface = DarkGray,
    onSurface = White,
    surfaceVariant = SemiTransparentBlack,
    onSurfaceVariant = LightGray,
    outline = MediumGray,
    outlineVariant = LightGray,
    scrim = Color(0x80000000),
    error = ErrorRed,
    onError = Color.Black,
    inverseSurface = LightGray,
    inverseOnSurface = Black,
    surfaceTint = Blue
)

// Light color scheme
private val LightColorScheme = lightColorScheme(
    primary = LightBlue,
    onPrimary = White,
    primaryContainer = Blue.copy(alpha = 0.1f),
    onPrimaryContainer = Blue,
    secondary = DarkOrange,
    onSecondary = White,
    tertiary = Orange,
    onTertiary = White,
    background = VeryLightGray,
    onBackground = Black,
    surface = White,
    onSurface = Black,
    surfaceVariant = LightGray,
    onSurfaceVariant = DarkGray,
    outline = MediumGray,
    outlineVariant = DarkGray.copy(alpha = 0.5f),
    scrim = Black.copy(alpha = 0.3f),
    error = DarkErrorRed,
    onError = White,
    inverseSurface = DarkGray,
    inverseOnSurface = White,
    surfaceTint = LightBlue
)

@Composable
fun YoyiMoviesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(8.dp),
        large = RoundedCornerShape(16.dp)
    )

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = shapes,
        content = content
    )
}