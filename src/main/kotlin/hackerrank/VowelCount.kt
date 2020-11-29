package hackerrank

fun findSubstring(s: String, k: Int): String {
    var maxVowels = 0
    var result = "Not found!"

    var startIndex = 0
    var endIndex = k

    while (endIndex <= s.length) {
        var vowels = 0
        val substr = StringBuilder()
        var i = startIndex
        while (i < endIndex) {
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
                vowels++
            }
            substr.append(s[i])
            i++
        }

        if (vowels > maxVowels) {
            maxVowels = vowels
            result = substr.toString()
        }

        startIndex++
        endIndex++
    }

    return result
}

fun countVowels(s: String): Int {
    var count = 0
    for (i in s.indices) {
        if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
            count++
        }
    }
    return count
}