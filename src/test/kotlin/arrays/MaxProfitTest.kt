package arrays

import org.junit.Assert.assertEquals
import org.junit.Test

class MaxProfitTest {

    @Test
    fun should_compute_high_and_low_mix() {
        val input = intArrayOf(7, 1, 5, 3, 6, 4)

        val result = maxProfit(input)

        assertEquals(7, result)
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