package math

import org.junit.Assert
import org.junit.Test

class RomanNumeralsTest {
    @Test
    fun should_return_roman_numeral_1() {
        val input = "III"
        val expected = 3
        val result = romanToInt(input)

        Assert.assertEquals(expected, result)
    }

    @Test
    fun should_return_roman_numeral_2() {
        val input = "LVIII"
        val expected = 58
        val result = romanToInt(input)

        Assert.assertEquals(expected, result)
    }

    @Test
    fun should_return_roman_numeral_3() {
        val input = "IV"
        val expected = 4
        val result = romanToInt(input)

        Assert.assertEquals(expected, result)
    }

    @Test
    fun should_return_roman_numeral_4() {
        val input = "IX"
        val expected = 9
        val result = romanToInt(input)

        Assert.assertEquals(expected, result)
    }

    @Test
    fun should_return_roman_numeral_5() {
        val input = "MCMXCIV"
        val expected = 1994
        val result = romanToInt(input)

        Assert.assertEquals(expected, result)
    }
}