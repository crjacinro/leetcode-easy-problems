package arrays

import org.junit.Assert.assertTrue
import org.junit.Test

class RotateArrayTest {

    @Test
    fun should_compute_high_and_low_mix() {
        val input = intArrayOf(7, 1, 5, 3, 6, 4)
        val k = 75 // use 3
        val expected = intArrayOf(3, 6, 4, 7, 1, 5)

        val result = rotateArray(input, k)

        assertTrue(expected.contentEquals(result))
    }


}