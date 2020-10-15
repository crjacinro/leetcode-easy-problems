package arrays

import org.junit.Assert
import org.junit.Test

class SingleNumberTest {
    @Test
    fun should_return_one() {
        val input = intArrayOf(1, 2, 3, 2, 3, 3, 2, 2, 3)

        val result = singleNumber(input)

        Assert.assertEquals(1, result)
    }
}