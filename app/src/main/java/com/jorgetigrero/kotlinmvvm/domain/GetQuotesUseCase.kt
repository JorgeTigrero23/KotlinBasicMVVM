package com.jorgetigrero.kotlinmvvm.domain

import com.jorgetigrero.kotlinmvvm.data.QuoteRepository
import com.jorgetigrero.kotlinmvvm.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}