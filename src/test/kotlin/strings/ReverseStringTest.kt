package strings

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {
    @Test
    fun should_reverse_string() {
        val input = charArrayOf('h', 'e', 'l', 'l', 'o')
        val expected = charArrayOf('o', 'l', 'l', 'e', 'h')

        val result = reverseString(input)

        Assert.assertTrue(expected.contentEquals(result))
    }

    @Test
    fun should_reverse_string_even() {
        val input = charArrayOf('h', 'e', 'g', 'l', 'l', 'o')
        val expected = charArrayOf('o', 'l', 'l', 'g', 'e', 'h')

        val result = reverseString(input)

        Assert.assertTrue(expected.contentEquals(result))
    }
}