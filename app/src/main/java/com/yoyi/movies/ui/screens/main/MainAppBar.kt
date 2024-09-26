package com.yoyi.movies.ui.screens.main

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.yoyi.movies.R
import com.yoyi.movies.ui.screens.shared.AppBarAction
import com.yoyi.movies.ui.theme.Dimens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAppBar(
    onUpClick: () -> Unit = { },
    isMainScreen: Boolean = false,
    title: String = stringResource(id = R.string.app_name)
) {

    TopAppBar(
        title = { TitleAppBar(title) },
        navigationIcon = {
            if (!isMainScreen) {
                AppBarAction(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    onClick = { onUpClick() }
                )
            }
        }
    )
}

@Composable
private fun TitleAppBar(title: String) {
    Row {
        Text(text = title)
        Spacer(modifier = Modifier.width(Dimens.large.default))
    }
}