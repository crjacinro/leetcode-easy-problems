package math

import org.junit.Assert
import org.junit.Test

class CountPrimesTest {
    @Test
    fun should_return_primes() {
        val input = 10
        val expected = 4

        val result = countPrimes(input)

        Assert.assertEquals(expected, result)
    }
}