package dynamicprogramming

import org.junit.Assert
import org.junit.Test

class MaxSubArrayTest {
    @Test
    fun should_compute_high_and_low_mix() {
        val input = intArrayOf(7, 1, 5, 3, 6, 4)

        val result = maxProfit(input)

        Assert.assertEquals(5, result)
    }
}