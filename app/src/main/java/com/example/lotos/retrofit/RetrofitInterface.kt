package com.example.lotos.retrofit

import com.example.lotos.model.Quotes
import retrofit2.Response
import retrofit2.http.GET


interface RetrofitInterface {
    @GET("quotes")
    suspend fun quotes() : Response<Quotes>
}