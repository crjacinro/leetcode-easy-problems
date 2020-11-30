package others

import org.junit.Assert
import org.junit.Test

class HammingWeightTest {
    @Test
    fun should_return_binary() {
        val input = 521
        val expected = 3
        val result = hammingWeight(input)

        Assert.assertEquals(expected, result)
    }
}