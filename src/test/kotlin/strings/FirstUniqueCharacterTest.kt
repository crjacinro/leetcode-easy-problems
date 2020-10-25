package strings

import junit.framework.TestCase.assertEquals
import org.junit.Test

class FirstUniqueCharacterTest {
    @Test
    fun should_find_first_unique_char() {
        val input = "leetcode"
        val expected = 0

        val result = findFirstUniqueChar(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_find_first_unique_char_2() {
        val input = "loveleetcode"
        val expected = 2

        val result = findFirstUniqueChar(input)

        assertEquals(expected, result)
    }
}