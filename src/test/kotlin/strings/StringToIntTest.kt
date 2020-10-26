package strings

import org.junit.Assert.assertEquals
import org.junit.Test

class StringToIntTest {
    @Test
    fun should_handle_default() {
        val input = "42"
        val expected = 42

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_negative() {
        val input = "-42"
        val expected = -42

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_positive() {
        val input = "+42"
        val expected = 42

        val result = myAtoi(input)

        assertEquals(expected, result)
    }


    @Test
    fun should_handle_with_extra_words() {
        val input = "+42 werwer fdsfs"
        val expected = 42

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_long_ints() {
        val input = "-91283472332"
        val expected = -2147483648

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_decimals() {
        val input = "3.14159"
        val expected = 3

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_mixed_signs() {
        val input = "+-12"
        val expected = 0

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_signOnly() {
        val input = "+"
        val expected = 0

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_empty() {
        val input = ""
        val expected = 0

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_low() {
        val input = "21474836460"
        val expected = 2147483647

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_char() {
        val input = "  -0012a42"
        val expected = -12

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_char_weird() {
        val input = "00000-42a1234"
        val expected = 0

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_weird() {
        val input = "   +0 123"
        val expected = 0

        val result = myAtoi(input)

        assertEquals(expected, result)
    }


    @Test
    fun should_handle_long_200000() {
        val input = "20000000000000000000"
        val expected = 2147483647

        val result = myAtoi(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_handle_space() {
        val input = "   "
        val expected = 0

        val result = myAtoi(input)

        assertEquals(expected, result)
    }
}