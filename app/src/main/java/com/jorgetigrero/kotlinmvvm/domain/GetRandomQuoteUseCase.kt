package com.jorgetigrero.kotlinmvvm.domain

import com.jorgetigrero.kotlinmvvm.data.model.QuoteModel
import com.jorgetigrero.kotlinmvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke():QuoteModel?{
        val quotes:List<QuoteModel> = QuoteProvider.quotes

        if(!quotes.isNullOrEmpty()) {
            //val randomNumber = (0..quotes.size -1).random()
            val randomNumber = (quotes.indices).random()
            return quotes[3]
        }
        return null
    }
}