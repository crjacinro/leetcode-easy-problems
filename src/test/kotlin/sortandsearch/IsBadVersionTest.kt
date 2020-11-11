package sortandsearch

import junit.framework.TestCase.assertEquals
import org.junit.Test
import sortedandsearch.IsBadVersion

class IsBadVersionTest {
    @Test
    fun should_merge_simple() {
        val versions = 5
        val bad = 4

        val badVersion = IsBadVersion(bad)
        val result = badVersion.firstBadVersion(versions)

        assertEquals(result, bad)
    }
}