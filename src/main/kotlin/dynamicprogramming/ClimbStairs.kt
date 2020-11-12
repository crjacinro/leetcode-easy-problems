package dynamicprogramming

fun climbStairs(n: Int): Int {
    return dp(0, n)
}

private fun dp(step: Int, n: Int): Int {
    if (n - step == 1) return 1
    if (n - step == 2) return 2

    val oneStep = dp(step + 1, n)
    val twoStep = dp(step + 2, n)

    return oneStep + twoStep
}