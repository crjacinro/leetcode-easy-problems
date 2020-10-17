package arrays

import junit.framework.Assert
import org.junit.Test

class PlusOneTest {
    @Test
    fun should_plus_one() {
        val input1 = intArrayOf(1, 2, 2, 1)
        val expected = intArrayOf(1, 2, 2, 2)

        val result = plusOne(input1)

        Assert.assertTrue(result.contentEquals(expected))
    }

    @Test
    fun should_plus_one_and_carry() {
        val input1 = intArrayOf(9, 9, 9)
        val expected = intArrayOf(1, 0, 0, 0)

        val result = plusOne(input1)

        Assert.assertTrue(result.contentEquals(expected))
    }

    @Test
    fun should_plus_one_and_carry_1() {
        val input1 = intArrayOf(8, 9, 9)
        val expected = intArrayOf(9, 0, 0)

        val result = plusOne(input1)

        Assert.assertTrue(result.contentEquals(expected))
    }
}