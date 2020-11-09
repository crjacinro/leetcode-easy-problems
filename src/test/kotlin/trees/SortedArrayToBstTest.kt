package trees

import junit.framework.TestCase.assertTrue
import org.junit.Test

class SortedArrayToBstTest {
    @Test
    fun should_convert_to_bst() {
        val input = intArrayOf(-10, -3, 0, 5, 9)

        val result = sortedArrayToBST(input)

        assertTrue(isValidBST(result))
    }
}