package com.ashdroid.common.data.model

data class Artist(
    val id: Int,
    val stageName: String,
    val profilePictureUrl: String,
    val isGroup: Boolean = false,
)