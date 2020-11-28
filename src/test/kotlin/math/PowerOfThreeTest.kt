package math

import org.junit.Assert
import org.junit.Test

class PowerOfThreeTest {
    @Test
    fun should_return_power_of_three() {
        val input = 9
        val result = isPowerOfThree(input)

        Assert.assertTrue(result)
    }

    @Test
    fun should_return_power_of_three_false() {
        val input = 5
        val result = isPowerOfThree(input)

        Assert.assertFalse(result)
    }

    @Test
    fun should_return_power_of_three_big() {
        val input = 2147483647
        val result = isPowerOfThree(input)

        Assert.assertFalse(result)
    }
}
