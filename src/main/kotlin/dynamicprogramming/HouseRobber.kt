package dynamicprogramming

fun rob(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    val startDayOne = alternateSum(nums)
    val startDayTwo = alternateSum(nums.copyOfRange(1, nums.size))

    return if (startDayOne > startDayTwo) startDayOne else startDayTwo
}

private fun alternateSum(nums: IntArray): Int {
    var sum = 0
    var i = 0
    while (i < nums.size) {
        sum += nums[i]

        i += 2
    }

    return sum
}