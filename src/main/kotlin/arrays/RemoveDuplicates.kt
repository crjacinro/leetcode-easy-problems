package arrays

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var unique = 0
    for (next in 0 until nums.size - 1) {
        if (nums[unique] != nums[next + 1]) {
            nums[++unique] = nums[next + 1]
        }
    }

    return unique + 1
}