package com.ashdroid.feature.song_details.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
internal fun SongTitleView(
    modifier: Modifier = Modifier,
    title: String,
) {
    Text(
        modifier = modifier
            .fillMaxWidth(),
        text = title,
        fontSize = 22.sp,
        fontWeight = FontWeight.W600,
    )
}

@Preview(
    showBackground = true,
    backgroundColor = 0xffffffff,
)
@Composable
private fun SongTitlePreview() {
    SongTitleView(
        title = "Sunrise Serenade"
    )
}