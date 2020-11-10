package sortandsearch

import org.junit.Assert
import org.junit.Test
import sortedandsearch.merge

class MergeSortedArrayTest {
    @Test
    fun should_merge_simple() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val nums2 = intArrayOf(2, 5, 6)
        val m = 3
        val n = 3
        val expectedArray = intArrayOf(1, 2, 2, 3, 5, 6)

        merge(nums1, m, nums2, n)

        Assert.assertTrue(expectedArray.contentEquals(nums1))
    }
}