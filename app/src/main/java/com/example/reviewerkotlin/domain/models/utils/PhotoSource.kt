package com.example.reviewerkotlin.domain.models.utils

sealed class PhotoSource{
    class RemotePhoto(
        val internetLink: String,
        val internetToken: String,
    ) : PhotoSource()

    class Local(val uri: String): PhotoSource()
}
