package others

import org.junit.Assert
import org.junit.Test

class HammingDistance {
    @Test
    fun should_return_binary() {
        val x = 1
        val y = 4
        val expected = 2
        val result = hammingDistance(x, y)

        Assert.assertEquals(expected, result)
    }

}