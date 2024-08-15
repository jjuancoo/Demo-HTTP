package com.example.demohttp.presentation

import android.telecom.Call
import retrofit2.http.GET

interface StudentApiService {
    @GET("getOne/210373")
    fun getStudent():Call<StudentResponse>
}