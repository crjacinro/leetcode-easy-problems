package arrays

import org.junit.Assert.assertEquals
import org.junit.Test

class RemoveDuplicatesTest {

    @Test
    fun should_remove_duplicates_basic() {
        val input = intArrayOf(1, 1, 2)
        val expectedArray = intArrayOf(1, 2)

        val result = removeDuplicates(input)

        assertEquals(expectedArray.size, result)
        input.assertEqualsGivenLength(expectedArray, result)
    }

    @Test
    fun should_remove_duplicates_lengthy_input() {
        val input = intArrayOf(1, 1, 2, 3, 3, 3, 35, 4, 4, 0)
        val expectedArray = intArrayOf(1, 2, 3, 35, 4, 0)

        val result = removeDuplicates(input)

        assertEquals(expectedArray.size, result)
        input.assertEqualsGivenLength(expectedArray, result)
    }

    @Test
    fun should_remove_duplicates_empty_input() {
        val input = intArrayOf()
        val expectedArray = intArrayOf()

        val result = removeDuplicates(input)

        assertEquals(expectedArray.size, result)
        input.assertEqualsGivenLength(expectedArray, result)
    }

    private fun IntArray.assertEqualsGivenLength(expectedArray: IntArray, length: Int) {
        for (i in 0 until length) {
            assertEquals(expectedArray[i], this[i])
        }
    }
}