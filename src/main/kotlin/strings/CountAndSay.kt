package strings

fun countAndSay(n: Int): String {
    // Base case.
    if (n == 1) return "1"

    // Recursive case. count and say of n is to "say" the "count and say" of the previous number
    return say(countAndSay(n - 1))
}

fun say(input: String): String {
    val result = StringBuilder()
    var freqCounter = 0

    var current: Char = input[0]
    var next: Char

    // Two pointer approach
    // i will point to the first index of a new group
    // j will traverse to all the same elements found at i initially
    var i = 0
    var j = 0

    while (i < input.length && j < input.length) {
        current = input[i]
        next = input[j]

        if (current == next) {
            // We found a match. Increment counter and go to the next character
            freqCounter++
            j++
        } else {
            // We found another group. Append to the result by adding the "frequency" and the "character"
            result.append(freqCounter)
            result.append(current)

            // Set to the i to j since we found a new group. Reset the counter also
            i = j
            freqCounter = 0
        }
    }

    // Append to the result whatever the last value is
    result.append(freqCounter)
    result.append(current)

    return result.toString()
}