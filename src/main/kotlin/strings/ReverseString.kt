package strings

fun reverseString(input: CharArray): CharArray {
    if (input.isEmpty()) return input

    val lastIndex = input.size - 1

    for (i in 0 until input.size / 2) {
        val temp = input[i]
        input[i] = input[lastIndex - i]
        input[lastIndex - i] = temp
    }

    return input
}