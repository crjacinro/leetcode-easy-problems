package strings

fun myAtoi(input: String): Int {
    if (input.isEmpty()) return 0

    val result = StringBuilder()

    for (i in input.indices) {
        val charInput = input[i]
        val isValidNumber = charInput.isDigit()
        val isSign = (charInput == '-' || charInput == '+') && result.isEmpty()

        if (charInput != ' ') {
            if (isValidNumber || isSign) {
                if (isSign && isInvalidSign(input, i)) {
                    return 0
                }
                result.append(charInput)
            } else if (result.isEmpty()) {
                return 0
            } else if (result.isNotEmpty()) {
                break
            } else if (charInput == '.') {
                break
            }
        } else if (result.isNotEmpty()) {
            break
        }
    }

    val stringResult = result.toString()

    try {
        if (stringResult.toLong() > Int.MAX_VALUE) return Int.MAX_VALUE
        if (stringResult.toLong() < Int.MIN_VALUE) return Int.MIN_VALUE
    } catch (e: NumberFormatException) {
        if (stringResult.isEmpty()) return 0
        return if (stringResult.isNotEmpty() && stringResult[0] == '-') {
            Int.MIN_VALUE
        } else {
            Int.MAX_VALUE
        }
    }

    return try {
        stringResult.toInt()
    } catch (e: NumberFormatException) {
        0
    }

}

fun isInvalidSign(s: String, i: Int): Boolean {
    if (i > 0 && (s[i - 1] == '-' || s[i - 1] == '+')) return true
    if ((i == s.length - 1) || ((i != s.length - 1) && !s[i + 1].isDigit())) return true


    return false
}
