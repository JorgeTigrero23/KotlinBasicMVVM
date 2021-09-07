package com.jorgetigrero.kotlinmvvm.data.network

import com.jorgetigrero.kotlinmvvm.core.RetrofitHelper
import com.jorgetigrero.kotlinmvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class QuoteService {

    private val retrofit = RetrofitHelper.getRetrofit();

    suspend fun getQuotes():List<QuoteModel>{
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuote()
            response.body()!!
        }


    }

}