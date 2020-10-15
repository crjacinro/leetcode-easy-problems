package arrays

import org.junit.Assert
import org.junit.Test

class ContainsDuplicateTest {
    @Test
    fun should_have_duplicate() {
        val input = intArrayOf(1, 1, 2, 3, 4, 4, 5)

        val result = containsDuplicate(input)

        Assert.assertTrue(result)
    }

    @Test
    fun should_have_no_duplicate() {
        val input = intArrayOf(1, 2, 5, 3, 88, 34, 99)

        val result = containsDuplicate(input)

        Assert.assertFalse(result)
    }
}