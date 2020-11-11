package sortedandsearch

class IsBadVersion(badVersion: Int) : VersionControl(badVersion) {
    override fun firstBadVersion(n: Int): Int {
        return if (isBadVersion(n) && !isBadVersion(n - 1)) n
        else firstBadVersion(n - 1)
    }
}

abstract class VersionControl(private val badVersion: Int) {
    abstract fun firstBadVersion(n: Int): Int

    fun isBadVersion(version: Int) = version >= badVersion
}