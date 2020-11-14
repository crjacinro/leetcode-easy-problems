package dynamicprogramming

fun maxProfit(prices: IntArray): Int {
    var max = 0
    for (i in prices.indices) {
        val profit = profitAtIndex(prices.copyOfRange(0, i + 1))
        if (profit > max) max = profit
    }

    return max
}

private fun profitAtIndex(prices: IntArray): Int {
    if (prices.size <= 1) return 0
    val pastMinimum = prices.copyOfRange(0, prices.size - 1).min()!!
    val current = prices.last()
    val maxProfit = current - pastMinimum

    return if (maxProfit < 0) 0 else maxProfit
}