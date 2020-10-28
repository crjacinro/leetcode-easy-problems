package strings

fun countAndSay(n: Int): String {
    if (n == 1) return "1"

    return say(countAndSay(n - 1))
}

fun say(input: String): String {
    val result = StringBuilder()
    var freqCounter = 0

    var current: Char = input[0]
    var next: Char

    var i = 0
    var j = 0

    while (i < input.length && j < input.length) {
        current = input[i]
        next = input[j]

        if (current == next) {
            freqCounter++
            j++
        } else {
            i = j
            result.append(freqCounter)
            result.append(current)
            freqCounter = 0
        }
    }

    result.append(freqCounter)
    result.append(current)

    return result.toString()
}