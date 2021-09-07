package com.jorgetigrero.kotlinmvvm.data.network

import com.jorgetigrero.kotlinmvvm.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {

    @GET("/.json")
    suspend fun getAllQuote():Response<List<QuoteModel>>;
}