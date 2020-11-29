package hackerrank

import org.junit.Assert
import org.junit.Test

class VowelCountTest {
    @Test
    fun should_count_vowel() {
        val input = "caberqiitefg"
        val length = 5
        val expected = "erqii"

        val result = findSubstring(input, length)

        Assert.assertEquals(expected, result)
    }

    @Test
    fun should_count_vowel_more() {
        val input = "aeiouia"
        val length = 3
        val expected = "aei"

        val result = findSubstring(input, length)

        Assert.assertEquals(expected, result)
    }

    @Test
    fun should_count_vowel_custom() {
        val input = "azerdii"
        val length = 5
        val expected = "erdii"

        val result = findSubstring(input, length)

        Assert.assertEquals(expected, result)
    }
}