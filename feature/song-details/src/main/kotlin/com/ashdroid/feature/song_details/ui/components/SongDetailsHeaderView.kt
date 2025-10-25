package com.ashdroid.feature.song_details.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.ashdroid.common.navigation.R


@Composable
internal fun SongDetailsHeaderView(
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.9f),
        painter = painterResource(R.drawable.music_default_thumbnail),
        contentDescription = "music thumbnail",
        contentScale = ContentScale.Crop,
        alpha = 0.8f,
    )
}

@Composable
@Preview
private fun SongDetailsHeaderPreview() {
    SongDetailsHeaderView()
}