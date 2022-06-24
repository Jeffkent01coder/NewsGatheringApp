package com.dekow.newsgatheringapp.domain.model.data_transfer_obj.test


import com.google.gson.annotations.SerializedName

class GuardianTag(
    val apiUrl: String,
    val bio: String,
    val bylineImageUrl: String,
    val bylineLargeImageUrl: String,
    val firstName: String,
    val id: String,
    val lastName: String,
    val references: List<Any>,
    val twitterHandle: String,
    val type: String,
    val webTitle: String,
    val webUrl: String
)