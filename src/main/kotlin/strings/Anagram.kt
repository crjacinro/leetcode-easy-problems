package strings

fun isAnagram(s: String, t: String): Boolean {
    val sMap = hashMapOf<Char, Int>()
    val tMap = hashMapOf<Char, Int>()

    for (i in s.indices) {
        val character = s[i]
        val frequency = sMap[character] ?: 0

        sMap[character] = frequency + 1
    }

    for (i in t.indices) {
        val character = t[i]
        val frequency = tMap[character] ?: 0

        tMap[character] = frequency + 1
    }

    return (sMap == tMap)
}