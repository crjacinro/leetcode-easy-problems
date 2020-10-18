package arrays

fun moveZeroes(input: IntArray): IntArray {
    for (i in 1 until input.size) {
        var swapIndex = i
        var temp: Int

        if (input[i - 1] == 0) {
            while (swapIndex >= 1 && input[swapIndex - 1] == 0) {
                temp = input[swapIndex - 1]
                input[swapIndex - 1] = input[swapIndex]
                input[swapIndex] = temp

                swapIndex--
            }
        }
    }

    return input
}

fun moveZeroesFast(input: IntArray): IntArray {
    var lastNonZero = 0
    for (i in input.indices) {
        var temp: Int

        if (input[i] != 0) {
            temp = input[lastNonZero]
            input[lastNonZero] = input[i]
            input[i] = temp
            lastNonZero++
        }
    }

    return input
}