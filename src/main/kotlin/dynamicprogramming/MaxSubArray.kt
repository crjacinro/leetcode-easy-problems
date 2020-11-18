package dynamicprogramming

// Todo: Find a dynamic programming recursive solution
//fun maxSubArrays(nums: IntArray): Int {
//    var max = Int.MIN_VALUE
//    for (i in nums.indices) {
//        val maxEnd = dp(nums.copyOfRange(0, i + 1))
//        max = if (maxEnd > max) maxEnd else max
//    }
//    return max
//}
//
//fun dp(nums: IntArray): Int {
//    if (nums.isEmpty()) return 0
//    if (nums.size == 1) return nums[0]
//
//    val leftArray = dp(nums.copyOfRange(0, nums.size - 1))
//    val totalSum = leftArray + nums.last()
//    val max = if (leftArray > totalSum) leftArray else totalSum
//
//    return if (max > nums.last()) max else nums.last()
//}

fun maxSubArray(nums: IntArray): Int {
    var best = nums[0]
    var sum = 0
    for (k in nums.indices) {
        val current = nums[k]
        val currentSum = sum + nums[k]
        sum = if (current > currentSum) current else currentSum
        best = if (best > sum) best else sum
    }
    return best
}
