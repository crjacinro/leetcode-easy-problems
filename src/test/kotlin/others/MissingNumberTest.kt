package others

import org.junit.Assert
import org.junit.Test

class MissingNumberTest {
    @Test
    fun should_return_missing_number() {
        val input = intArrayOf(3, 0, 1)
        val expected = 2
        val result = missingNumber(input)

        Assert.assertEquals(expected, result)
    }
}