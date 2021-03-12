package com.example.paging3sample.model

import com.google.gson.annotations.SerializedName

class RepoResponse(
    @SerializedName("items") val items: List<Repo> = emptyList()
)