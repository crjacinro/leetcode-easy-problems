package dynamicprogramming

import org.junit.Assert
import org.junit.Test

class HouseRobberTest {
    @Test
    fun should_return_max_amount() {
        val input = intArrayOf(1, 2, 3, 1)

        val result = rob(input)

        Assert.assertEquals(4, result)
    }

    @Test
    fun should_return_max_amount_2() {
        val input = intArrayOf(2, 7, 9, 3, 1)

        val result = rob(input)

        Assert.assertEquals(12, result)
    }
}