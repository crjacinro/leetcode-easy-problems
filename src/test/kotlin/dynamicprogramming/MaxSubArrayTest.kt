package dynamicprogramming

import org.junit.Assert
import org.junit.Test

class MaxSubArrayTest {
    @Test
    fun should_return_max_subarray() {
        val input = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)

        val result = maxSubArray(input)

        Assert.assertEquals(6, result)
    }

    @Test
    fun should_return_max_subarray_1() {
        val input = intArrayOf(1)

        val result = maxSubArray(input)

        Assert.assertEquals(1, result)
    }

    @Test
    fun should_return_max_subarray_0() {
        val input = intArrayOf(0)

        val result = maxSubArray(input)

        Assert.assertEquals(0, result)
    }

    @Test
    fun should_return_max_subarray_negative() {
        val input = intArrayOf(-1)

        val result = maxSubArray(input)

        Assert.assertEquals(-1, result)
    }


}