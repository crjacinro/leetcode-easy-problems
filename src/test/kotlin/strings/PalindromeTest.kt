package strings

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PalindromeTest {
    @Test
    fun should_return_true() {
        val input = "A man, a plan, a canal: Panama"

        val result = isPalindrome(input)

        assertTrue(result)
    }

    @Test
    fun should_return_false() {
        val input = "race a car"

        val result = isPalindrome(input)

        assertFalse(result)
    }
}