package math

fun romanToInt(s: String): Int {
    var result = 0
    var i = 0

    while (i < s.length) {
        // Get the current numerical value
        val current = lookUp(s[i])

        if (i < s.length - 1) {
            // Also check the next one so we can subtract if necessary
            val next = lookUp(s[i + 1])

            if (next > current) {
                // The next letter has higher value, thus subtract the current from next.
                // Skip the next letters
                result += next - current
                i += 2
                continue
            }
        }

        result += current
        i++
    }

    return result
}

fun lookUp(char: Char): Int {
    if (char == 'I') return 1
    if (char == 'V') return 5
    if (char == 'X') return 10
    if (char == 'L') return 50
    if (char == 'C') return 100
    if (char == 'D') return 500
    if (char == 'M') return 1000
    return 0
}