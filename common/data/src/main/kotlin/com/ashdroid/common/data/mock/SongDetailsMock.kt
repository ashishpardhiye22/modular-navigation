package com.ashdroid.common.data.mock

import com.ashdroid.common.data.model.SongDetails

internal val songDetails_1 = SongDetails(
    id = 1,
    title = "Sunrise Serenade",
    year = 2022,
    durationInSeconds = 185,
    shortDescription = "A tranquil acoustic start to the day.",

    fullLyrics = "The sun rose slow, a golden haze...\n(Insert full lyrics here)", // Very long string
    audioUrl = "https://example.com/audio/s1.mp3",
    fullCoverArtUrl = albumA.coverArtUrl,

    album = albumA,
    artists = listOf(artist1),

    relatedSongsIds = listOf(4, 16, 22),
    recordLabel = "Shoreline Records"
)