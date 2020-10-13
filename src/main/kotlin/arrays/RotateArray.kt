package arrays

fun rotateArray(input: IntArray, k: Int): IntArray {
    var arr = input
    var shifted = input
    val realRotations = k % input.size

    for (i in 0 until realRotations) {
        shifted = shiftRightArray(arr)
        arr = shifted
    }

    return shifted
}

private fun shiftRightArray(input: IntArray): IntArray {
    val last = input[input.size - 1]

    for (i in input.size - 2 downTo 0) {
        input[i + 1] = input[i]
    }

    input[0] = last
    return input
}