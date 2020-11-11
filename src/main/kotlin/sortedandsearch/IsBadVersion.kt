package sortedandsearch

class IsBadVersion(badVersion: Int) : VersionControl(badVersion) {
    override fun firstBadVersion(n: Int): Int {
        return binarySearch(1, n, n)
    }

    private fun binarySearch(start: Int, end: Int, n: Int): Int {
        if (isBadVersion(end) && !isBadVersion(end - 1)) return end

        val mid = start + ((end - start) / 2)
        val isBad = isBadVersion(mid)

        if (isBad && !isBadVersion(n - 1)) return mid

        if (!isBad) {
            return binarySearch(mid, end, (mid + (end - mid) / 2))
        }

        return binarySearch(start, mid, (start + (mid - start) / 2))
    }
}

abstract class VersionControl(private val badVersion: Int) {
    abstract fun firstBadVersion(n: Int): Int

    fun isBadVersion(version: Int) = version >= badVersion
}