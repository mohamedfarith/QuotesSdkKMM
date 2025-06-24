package com.learning.quotessdkkmm

import com.learning.quotessdkkmm.repository.QuoteRepository
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class QuoteRepositoryTest {

    private val repository = QuoteRepository()

    @Test
    fun testGetRandomQuoteReturnsValidQuote() {
        val quote = repository.getRandomQuote()
        println(quote.text)
        assertNotNull(quote.text)
        assertTrue(quote.text.isNotBlank())
    }

    @Test
    fun testGetQuoteOfTheDayIsConsistent() {
        val quote1 = repository.getQuoteOfTheDay()
        val quote2 = repository.getQuoteOfTheDay()
        assertEquals(quote1, quote2) // same result in a single day
    }
}