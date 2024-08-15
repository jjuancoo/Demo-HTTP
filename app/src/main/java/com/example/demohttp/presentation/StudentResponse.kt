package com.example.demohttp.presentation

import com.google.gson.annotations.SerializedName

data class StudentResponse(
    @SerializedName("_id")
    val _id: String,
    @SerializedName("lastname")
    val lastname: String,
    @SerializedName("grade")
    val grade: Int,
    @SerializedName("group")
    val group:String,
    @SerializedName("career")
    val career: String,
    @SerializedName("average")
    val average: Float
)
