package arrays

import junit.framework.TestCase.assertTrue
import org.junit.Test

class IntersectionTest {
    @Test
    fun should_get_intersection() {
        val input1 = intArrayOf(1, 2, 2, 1)
        val input2 = intArrayOf(2, 2)
        val expected = intArrayOf(2, 2)

        val result = intersect(input1, input2)

        assertTrue(result.contentEquals(expected))
    }

    @Test
    fun should_get_intersection1() {
        val input1 = intArrayOf(4, 9, 5)
        val input2 = intArrayOf(9, 4, 9, 8, 4)
        val expected = intArrayOf(4, 9)

        val result = intersect(input1, input2)

        assertTrue(result.contentEquals(expected))
    }

    @Test
    fun should_get_intersection2() {
        val input1 = intArrayOf(4, 9, 5, 2, 4, 6, 6, 7)
        val input2 = intArrayOf(9, 4, 9, 8, 4, 7, 6, 4, 3, 3, 12, 9)
        val expected = intArrayOf(4, 4, 6, 7, 9)

        val result = intersect(input1, input2)

        assertTrue(result.contentEquals(expected))
    }
}