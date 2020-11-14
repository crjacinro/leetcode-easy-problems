package dynamicprogramming

import org.junit.Assert.assertEquals
import org.junit.Test

class MaxProfit2Test {

    @Test
    fun should_compute_high_and_low_mix() {
        val input = intArrayOf(7, 1, 5, 3, 6, 4)

        val result = maxProfit(input)

        assertEquals(5, result)
    }

    @Test
    fun should_compute_increasing_prices() {
        val input = intArrayOf(1, 2, 3, 4, 5)

        val result = maxProfit(input)

        assertEquals(4, result)
    }

    @Test
    fun should_compute_decreasing_prices() {
        val input = intArrayOf(7, 6, 4, 3, 1)

        val result = maxProfit(input)

        assertEquals(0, result)
    }
}