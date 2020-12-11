package others


fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false
    if (s.length == 2) return isMatch(s[0], s[1])

    val arrayStack = mutableListOf<Char>()

    for (i in s.indices) {
        val current = s[i]

        if (current == '{' || current == '(' || current == '[') {
            arrayStack.add(current)
            continue
        }

        if (arrayStack.isNotEmpty() && isMatch(arrayStack.last(), current)) {
            arrayStack.removeAt(arrayStack.size - 1)
        } else {
            return false
        }
    }

    return arrayStack.isEmpty()
}

private fun isMatch(s1: Char, s2: Char): Boolean {
    if (s1 == '{' && s2 == '}') return true
    if (s1 == '[' && s2 == ']') return true
    if (s1 == '(' && s2 == ')') return true

    return false
}