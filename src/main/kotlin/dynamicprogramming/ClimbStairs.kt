package dynamicprogramming

fun climbStairs(n: Int): Int {
    return dp(0, n, hashMapOf())
}

private fun dp(step: Int, n: Int, mem: HashMap<Int, Int>): Int {
    if (mem.containsKey(step)) return mem[step]!!
    if (n - step == 1) return 1
    if (n - step == 2) return 2

    val oneStep = dp(step + 1, n, mem)
    val twoStep = dp(step + 2, n, mem)
    val result = oneStep + twoStep

    mem[step] = result

    return result
}