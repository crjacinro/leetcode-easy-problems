package hackerrank

import junit.framework.TestCase
import org.junit.Test

class AnagramTest {
    @Test
    fun is_anagram() {
        val s = listOf("hack", "a", "rank", "khac", "ackh", "kran", "rankhacker", "a", "ab", "ba", "stairs", "raits")
        val t = listOf("a", "nark", "bs", "hack", "stair")
        val expected = listOf(2, 2, 0, 3, 1)

        val result = stringAnagram(s.toTypedArray(), t.toTypedArray())

        TestCase.assertTrue(expected == result.toList())
    }
}


