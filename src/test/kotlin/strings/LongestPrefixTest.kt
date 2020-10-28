package strings

import junit.framework.TestCase
import org.junit.Test

class LongestPrefixTest {
    @Test
    fun should_return_fl() {
        val s = arrayOf("flower", "flow", "flight")
        val expected = "fl"

        val result = longestCommonPrefix(s)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_return_empty() {
        val s = arrayOf("dog", "racecar", "car")
        val expected = ""

        val result = longestCommonPrefix(s)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_handle_empty() {
        val s = arrayOf("", "gjkgj", "jkj")
        val expected = ""

        val result = longestCommonPrefix(s)

        TestCase.assertEquals(expected, result)
    }
}