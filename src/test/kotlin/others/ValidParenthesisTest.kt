package others

import org.junit.Assert
import org.junit.Test


class ValidParenthesisTest {
    @Test
    fun is_valid_parenthesis() {
        val input = "()"
        val result = isValid(input)

        Assert.assertTrue(result)
    }

    @Test
    fun is_valid_parenthesis_1() {
        val input = "()[]{}"
        val result = isValid(input)

        Assert.assertTrue(result)
    }

    @Test
    fun is_not_valid_parenthesis() {
        val input = "(]"
        val result = isValid(input)

        Assert.assertFalse(result)
    }

    @Test
    fun is_not_valid_parenthesis_2() {
        val input = "([)]"
        val result = isValid(input)

        Assert.assertFalse(result)
    }

    @Test
    fun is_valid_parenthesis_2() {
        val input = "{[]}"
        val result = isValid(input)

        Assert.assertTrue(result)
    }

    @Test
    fun is_valid_parenthesis_3() {
        val input = "([}}])"
        val result = isValid(input)

        Assert.assertFalse(result)
    }

    @Test
    fun is_valid_parenthesis_4() {
        val input = "[[[]"
        val result = isValid(input)

        Assert.assertFalse(result)
    }
}