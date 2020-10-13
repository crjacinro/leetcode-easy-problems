package arrays

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0

    for (i in 1 until prices.size) {
        if (prices[i] > prices[i - 1]) {
            maxProfit += prices[i] - prices[i - 1]
        }
    }

    return maxProfit
}

fun maxProfitMySolution(prices: IntArray): Int {
    var maxProfit = 0
    var currentPriceInStock = 0
    var hasStockInHand = false

    for (i in prices.indices) {
        val currentPrice = prices[i]
        if (i != prices.size - 1) {
            val nextPrice = prices[i + 1]

            if (nextPrice > currentPrice && !hasStockInHand) {
                hasStockInHand = true
                currentPriceInStock = currentPrice
            } else if (nextPrice < currentPrice && hasStockInHand) {
                hasStockInHand = false
                maxProfit += currentPrice - currentPriceInStock
            }
        } else if (hasStockInHand) {
            hasStockInHand = false
            maxProfit += currentPrice - currentPriceInStock
        }
    }

    return maxProfit
}