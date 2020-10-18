package arrays

import org.junit.Assert.assertTrue
import org.junit.Test

class MoveZeroesTest {
    @Test
    fun should_move_zeroes_to_end() {
        val input = intArrayOf(1, 0, 2, 0, 0, 4, 5)
        val expected = intArrayOf(1, 2, 4, 5, 0, 0, 0)

        val result = moveZeroes(input)

        assertTrue(result.contentEquals(expected))
    }

    @Test
    fun should_move_zeroes_to_end_1() {
        val input = intArrayOf(0, 1, 0, 3, 12)
        val expected = intArrayOf(1, 3, 12, 0, 0)

        val result = moveZeroes(input)

        assertTrue(result.contentEquals(expected))
    }

    @Test
    fun should_move_zeroes_to_end_2() {
        val input = intArrayOf(1, 1, 1, 0, 0, 0, 0)
        val expected = intArrayOf(1, 1, 1, 0, 0, 0, 0)

        val result = moveZeroes(input)

        assertTrue(result.contentEquals(expected))
    }

    @Test
    fun should_move_zeroes_to_end_3() {
        val input = intArrayOf(0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1)
        val expected = intArrayOf(1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0)

        val result = moveZeroes(input)

        assertTrue(result.contentEquals(expected))
    }

    @Test
    fun should_handle_empty() {
        val input = intArrayOf()
        val expected = intArrayOf()

        val result = moveZeroes(input)

        assertTrue(result.contentEquals(expected))
    }
}