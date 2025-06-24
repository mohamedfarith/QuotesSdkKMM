package com.learning.quotessdkkmm.repository

import com.learning.quotessdkkmm.models.Quote
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime


class QuoteRepository {

    private val quotes = listOf(
        Quote("The best way to get started is to quit talking and begin doing.", "Walt Disney"),
        Quote("Don't let yesterday take up too much of today.", "Will Rogers"),
        Quote("It’s not whether you get knocked down, it’s whether you get up.", "Vince Lombardi"),
        Quote("If you are working on something exciting, it will keep you motivated.", "Steve Jobs"),
        Quote("Success is not in what you have, but who you are.", "Bo Bennett")
    )

    fun getRandomQuote(): Quote {
        return quotes.random()
    }

    fun getQuoteOfTheDay(): Quote {
        val dayOfYear = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()).date.dayOfYear
        return quotes[dayOfYear % quotes.size]
    }

    fun getAllQuotes(): List<Quote> = quotes
}