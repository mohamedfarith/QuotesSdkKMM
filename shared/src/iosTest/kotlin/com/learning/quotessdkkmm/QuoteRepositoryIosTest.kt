package com.learning.quotessdkkmm

import com.learning.quotessdkkmm.repository.QuoteRepository
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class QuoteRepositoryIosTest {

    @Test
    fun testQuoteOfTheDayIsValid() {
        val repo = QuoteRepository()
        val quote = repo.getQuoteOfTheDay()
        println("iOS Quote of the Day: ${quote.text} — ${quote.author}")
        assertTrue(quote.text.isNotBlank())
    }

    @Test
    fun testRandomQuoteIsDifferent() {
        val repo = QuoteRepository()
        val q1 = repo.getRandomQuote()
        val q2 = repo.getRandomQuote()
        assertNotNull(q1)
        assertNotNull(q2)
        println("Random iOS Quote: ${q1.text} — ${q1.author}")
    }
}