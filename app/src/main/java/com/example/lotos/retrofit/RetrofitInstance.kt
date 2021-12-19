package com.example.lotos.retrofit

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    final val URL = "http://mskko2021.mad.hakta.pro/api/"

    private val retrofit by lazy {
        Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build()
    }

    val api : RetrofitInterface by lazy {
        retrofit.create(RetrofitInterface::class.java)
    }
}