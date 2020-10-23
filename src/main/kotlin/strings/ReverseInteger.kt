package strings

fun reverseInteger(input: Int): Int {
    val isNegative = input < 0
    val inputStr = input.toString()
    val lastIndex = inputStr.length - 1
    val stringBuilder = StringBuilder()

    for (i in inputStr.indices) {
        if (lastIndex - i == 0 && isNegative) break
        stringBuilder.append(inputStr[lastIndex - i])
    }
    var result = stringBuilder.toString()

    if (result.toLong() > Int.MAX_VALUE) {
        return 0
    }

    if (isNegative) {
        result = StringBuilder().run {
            this.append("-")
            this.append(result).toString()
        }
    }

    return result.toInt()
}