package dynamicprogramming

fun rob(nums: IntArray): Int {
   return dp(nums, hashMapOf())
}

private fun dp(nums: IntArray, mem: HashMap<Int, Int>): Int {
    if (mem[nums.size] != null) {
        return mem[nums.size]!!
    }

    if (nums.isEmpty()) {
        mem[0] = 0
        return mem[0]!!
    }
    if (nums.size == 1) {
        mem[1] = nums[0]
        return mem[1]!!
    }
    if (nums.size == 2) {
        mem[2] = Math.max(nums[0], nums[1])
        return mem[2]!!
    }

    val robSkipped = dp(nums.copyOfRange(0, nums.size - 2), mem)
    val last = nums.last()
    val useSkipped = dp(nums.copyOfRange(0, nums.size - 1), mem)

    mem[nums.size] = Math.max(robSkipped + last, useSkipped)

    return mem[nums.size]!!
}