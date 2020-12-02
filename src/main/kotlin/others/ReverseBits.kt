package others


fun reverseBits(n: Int): Int {
    var result = 0
    var input = n
    var count = 0

    while (count < 32) {
        val leastBit = input and 1
        result += leastBit shl (31 - count)
        input = input shr 1
        count++
    }

    return result
}