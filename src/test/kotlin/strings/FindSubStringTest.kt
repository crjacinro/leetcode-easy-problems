package strings

import junit.framework.TestCase
import org.junit.Test

class FindSubStringTest {
    @Test
    fun should_find_index() {
        val haystack = "hello"
        val needle = "ll"
        val expected = 2

        val result = strStr(haystack, needle)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_find_index_none() {
        val haystack = "aaaaa"
        val needle = "bba"
        val expected = -1

        val result = strStr(haystack, needle)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_find_index_empty() {
        val haystack = ""
        val needle = ""
        val expected = 0

        val result = strStr(haystack, needle)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_find_2() {
        val haystack = "hellomictest"
        val needle = "mic"
        val expected = 5

        val result = strStr(haystack, needle)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_find_3() {
        val haystack = "hellomictest"
        val needle = "micg"
        val expected = -1

        val result = strStr(haystack, needle)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_find_empty_needle() {
        val haystack = "hellomictest"
        val needle = ""
        val expected = 0

        val result = strStr(haystack, needle)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_find_empty_haystack() {
        val haystack = ""
        val needle = "hellomictest"
        val expected = -1

        val result = strStr(haystack, needle)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_find_aaaa() {
        val haystack = "aaa"
        val needle = "aaaaa"
        val expected = -1

        val result = strStr(haystack, needle)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_find_almost() {
        val haystack = "mississippi"
        val needle = "issipi"
        val expected = -1

        val result = strStr(haystack, needle)

        TestCase.assertEquals(expected, result)
    }

}