package com.example.videoplayer

import android.net.Uri

data class Video(
    val id:String,
    val title:String,
    val duration: Long,
    val folderName: String,
    val size: String,
    val path: String,
    val artUri: Uri
)
