package com.example.lotos.retrofit

import com.example.lotos.model.Quotes
import retrofit2.Response

class Repository {

    suspend fun quotes() : Response<Quotes> {
        return RetrofitInstance.api.quotes()
    }
}