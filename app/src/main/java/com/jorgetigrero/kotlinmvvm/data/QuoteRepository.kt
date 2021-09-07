package com.jorgetigrero.kotlinmvvm.data

import com.jorgetigrero.kotlinmvvm.data.model.QuoteModel
import com.jorgetigrero.kotlinmvvm.data.network.QuoteService

class QuoteRepository  {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response:List<QuoteModel> = api.getQuotes()
        return response
    }

}