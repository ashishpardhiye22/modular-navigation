package com.ashdroid.feature.dashboard.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ashdroid.common.data.mock.mockSongListItems
import com.ashdroid.common.data.model.SongListItem
import com.ashdroid.common.navigation.R

@Composable
internal fun SongListItemView(
    modifier: Modifier = Modifier,
    songListItem: SongListItem,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            modifier = Modifier
                .size(60.dp)
                .clip(RoundedCornerShape(8.dp)),
            painter = painterResource(R.drawable.music_default_thumbnail),
            contentDescription = "music thumbnail",
        )

        Column(
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(1f)
                .align(Alignment.CenterVertically),
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = songListItem.title,
                fontWeight = FontWeight.W600,
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = songListItem.artistName
            )
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xffffffff,
)
@Composable
private fun SongListItemPreview() {
    SongListItemView(
        songListItem = mockSongListItems.first()
    )
}