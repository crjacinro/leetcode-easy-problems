package strings

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val map = hashMapOf<Char, Int>()

    for (i in s.indices) {
        val character = s[i]
        val frequency = map[character] ?: 0

        map[character] = frequency + 1
    }

    for (i in t.indices) {
        val character = t[i]
        val frequency = map[character] ?: 0
        if (frequency == 0) {
            return false
        }
        map[character] = frequency - 1
    }

    return true
}