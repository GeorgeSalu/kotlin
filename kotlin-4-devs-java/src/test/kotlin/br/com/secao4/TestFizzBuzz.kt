package br.com.secao4

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class TestFizzBuzz {

    @Test
    fun `Calling fizzbuzz with "5" returns list with 5 items`() {
        fizzBuzz(5) shouldBeEqualTo listOf("1", "2", "Fizz", "4", "Buzz")
    }

}