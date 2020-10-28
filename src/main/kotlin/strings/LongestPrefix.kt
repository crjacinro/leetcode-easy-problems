package strings

fun longestCommonPrefix(strs: Array<String>): String {
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