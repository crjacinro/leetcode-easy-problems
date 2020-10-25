package strings

import junit.framework.TestCase.assertEquals
import org.junit.Test

class ReverseIntegerTest {
    @Test
    fun should_reverse_string() {
        val input = 123
        val expected = 321

        val result = reverseInteger(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_reverse_string_negative() {
        val input = -123
        val expected = -321

        val result = reverseInteger(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_reverse_string_0() {
        val input = 0
        val expected = 0

        val result = reverseInteger(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_reverse_string_trailing_0() {
        val input = 1200
        val expected = 21

        val result = reverseInteger(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_reverse_string_big() {
        val input = 1534236469
        val expected = 0

        val result = reverseInteger(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_reverse_string_big_negative() {
        val input = -2147483648
        val expected = 0

        val result = reverseInteger(input)

        assertEquals(expected, result)
    }
}