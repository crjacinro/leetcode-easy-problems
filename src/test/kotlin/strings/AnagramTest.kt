package strings

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class AnagramTest {
    @Test
    fun is_anagram() {
        val s = "anagram"
        val t = "nagaram"

        val result = isAnagram(s, t)

        assertTrue(result)
    }

    @Test
    fun is_not_anagram() {
        val s = "rat"
        val t = "cat"

        val result = isAnagram(s, t)

        assertFalse(result)
    }

    @Test
    fun is_not_anagram_if_length_is_different() {
        val s = "a"
        val t = "ab"

        val result = isAnagram(s, t)

        assertFalse(result)
    }
}