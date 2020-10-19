package arrays

import org.junit.Assert
import org.junit.Test

class TwoSumTest {
    @Test
    fun should_return_two_sum_1() {
        val input = intArrayOf(2, 7, 11, 15)
        val expected = intArrayOf(0, 1)
        val target = 9

        val result = twoSum(input, target)

        Assert.assertTrue(result.contentEquals(expected))
    }

    @Test
    fun should_return_two_sum_2() {
        val input = intArrayOf(3, 2, 4)
        val expected = intArrayOf(1, 2)
        val target = 6

        val result = twoSum(input, target)

        Assert.assertTrue(result.contentEquals(expected))
    }

    @Test
    fun should_return_two_sum_3() {
        val input = intArrayOf(3, 3)
        val expected = intArrayOf(0, 1)
        val target = 6

        val result = twoSum(input, target)

        Assert.assertTrue(result.contentEquals(expected))
    }
}