package others

fun missingNumber(nums: IntArray): Int {
    val max = nums.size
    val totalMax = max * (max + 1) / 2
    var totalCurrent = 0

    for (i in nums.indices) {
        totalCurrent += nums[i]
    }

    return totalMax - totalCurrent
}