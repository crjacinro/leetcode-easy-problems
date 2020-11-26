package math

import org.junit.Assert
import org.junit.Test


class FizzBuzzTest {
    @Test
    fun should_return_fizz_buzz() {
        val input = 15
        val expected = listOf(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz"
        )

        val result = fizzBuzz(input)

        Assert.assertTrue(expected.toTypedArray().contentEquals(result.toTypedArray()))

    }
}