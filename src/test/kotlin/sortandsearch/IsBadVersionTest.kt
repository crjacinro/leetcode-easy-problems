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

        assertEquals(bad, result)
    }

    @Test
    fun should_merge_large() {
        val versions = 20
        val bad = 14

        val badVersion = IsBadVersion(bad)
        val result = badVersion.firstBadVersion(versions)

        assertEquals(bad, result)
    }

    @Test
    fun should_merge_large_2() {
        val versions = 20
        val bad = 18

        val badVersion = IsBadVersion(bad)
        val result = badVersion.firstBadVersion(versions)

        assertEquals(bad, result)
    }

    @Test
    fun should_merge_large_super() {
        val versions = 123455
        val bad = 567

        val badVersion = IsBadVersion(bad)
        val result = badVersion.firstBadVersion(versions)

        assertEquals(bad, result)
    }

    @Test
    fun should_merge_large_super_large() {
        val versions = 2126753390
        val bad = 1702766719

        val badVersion = IsBadVersion(bad)
        val result = badVersion.firstBadVersion(versions)

        assertEquals(bad, result)
    }

    @Test
    fun should_merge_same() {
        val versions = 2
        val bad = 2

        val badVersion = IsBadVersion(bad)
        val result = badVersion.firstBadVersion(versions)

        assertEquals(bad, result)
    }

    @Test
    fun should_merge_one() {
        val versions = 1
        val bad = 1

        val badVersion = IsBadVersion(bad)
        val result = badVersion.firstBadVersion(versions)

        assertEquals(bad, result)
    }

    @Test
    fun should_merge_32() {
        val versions = 3
        val bad = 2

        val badVersion = IsBadVersion(bad)
        val result = badVersion.firstBadVersion(versions)

        assertEquals(bad, result)
    }
}