package com.ashdroid.common.data.mock

import com.ashdroid.common.data.model.Artist

val artist1 = Artist(
    id = 101,
    stageName = "Acoustic Voyager",
    profilePictureUrl = "https://example.com/artist/voyager_pfp.jpg",
    isGroup = false
)

internal val artist2 = Artist(
    id = 102,
    stageName = "The Neon Drifters",
    profilePictureUrl = "https://example.com/artist/drifters_pfp.jpg",
    isGroup = true
)

internal val artist3 = Artist(
    id = 103,
    stageName = "Luna Echo",
    profilePictureUrl = "https://example.com/artist/luna_pfp.jpg",
    isGroup = false
)