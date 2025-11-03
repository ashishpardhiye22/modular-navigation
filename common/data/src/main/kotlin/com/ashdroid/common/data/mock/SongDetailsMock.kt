package com.ashdroid.common.data.mock

import com.ashdroid.common.data.model.SongDetails

val songDetails_1 = SongDetails(
    id = 1,
    title = "Sunrise Serenade",
    year = 2022,
    durationInSeconds = 185,
    shortDescription = "A tranquil acoustic start to the day.",
    fullLyrics = "Good mornin',\n" +
            "Good mornin'\n" +
            "You sleepy head,\n" +
            "It's dawnin',\n" +
            "Stop yawnin',\n" +
            "Get out of that bed.\n" +
            "Say, the air is soft as silk,\n" +
            "It's time to get the mornin' milk,\n" +
            "Come on wake up!\n" +
            "Get up!\n" +
            "Look at the grass\n" +
            "Silver in the sun,\n" +
            "Heavy with the dew,\n" +
            "Look at the buds,\n" +
            "You can almost see\n" +
            "How they're breakin' through;\n" +
            "Look at the birds\n" +
            "Feedin' all their young\n" +
            "In the sycamores,\n" +
            "But you better get on\n" +
            "With your mornin' chores.\n" +
            "Just take a breath\n" +
            "Of that newmown hay\n" +
            "And the sugar cane;\n" +
            "Looks like tonight\n" +
            "There should be a moon\n" +
            "Down in lover's lane.\n" +
            "There you go daydreaming\n" +
            "When it's time that you obeyed\n" +
            "That sunrise serenade.",
    audioUrl = "https://example.com/audio/s1.mp3",
    fullCoverArtUrl = albumA.coverArtUrl,
    album = albumA,
    artists = listOf(artist1),
    relatedSongsIds = listOf(4, 16, 22),
    recordLabel = "Shoreline Records"
)