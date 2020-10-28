package strings

fun longestCommonPrefixNonRecursive(strs: Array<String>): String {
    val minLength = strs.map { it.length }.min() ?: 0
    val result = StringBuilder()

    for (i in 0 until minLength) {
        var prefix: Char? = null
        for (j in strs.indices) {
            val char = strs[j][i]
            if (prefix == null) {
                prefix = char
            } else if (char != prefix) {
                return result.toString()
            }
        }
        result.append(prefix)
    }

    return result.toString()
}


fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isNullOrEmpty()) return ""
    return longestComPrefix(strs, 0, strs.size - 1)
}

fun longestComPrefix(strs: Array<String>, start: Int, end: Int): String {
    if (start == end) return strs[start]

    val middle = (start + end) / 2
    val left = longestComPrefix(strs, start, middle)
    val right = longestComPrefix(strs, middle + 1, end)

    return findLongestCommonPrefix(left, right)
}

fun findLongestCommonPrefix(left: String, right: String): String {
    val min = if (left.length < right.length) left.length else right.length
    val result = StringBuilder()
    for (i in 0 until min) {
        if (left[i] == right[i]) {
            result.append(left[i])
        } else {
            break
        }
    }
    return result.toString()
}