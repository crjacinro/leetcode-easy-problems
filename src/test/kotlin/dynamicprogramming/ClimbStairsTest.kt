package dynamicprogramming

import junit.framework.TestCase
import org.junit.Test

class ClimbStairsTest {
    @Test
    fun should_climb_2() {
        val stairs = 2
        val expected = 2

        val result = climbStairs(stairs)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_climb_3() {
        val stairs = 3
        val expected = 3

        val result = climbStairs(stairs)

        TestCase.assertEquals(expected, result)
    }

    @Test
    fun should_climb_4() {
        val stairs = 4
        val expected = 5

        val result = climbStairs(stairs)

        TestCase.assertEquals(expected, result)
    }
}