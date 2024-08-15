package com.example.demohttp.presentation

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

object RetrofitClient {
    private const val BASE_URL = "http://10.10.60.14:3000/"
    val instance:StudentApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL),
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(StudentsApiService::class.java)
    }
}