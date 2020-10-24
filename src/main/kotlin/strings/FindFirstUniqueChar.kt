package strings

fun findFirstUniqueChar(input: String): Int {
    val hashMap = linkedMapOf<Char, Pair<Int, Int>>()

    for (i in input.indices) {
        val letter = input[i]

        if (!hashMap.containsKey(letter)) {
            hashMap[letter] = Pair(i, 1)
        } else {
            val pair = hashMap[letter]
            hashMap[letter] = Pair(pair?.first ?: -1, pair?.second?.plus(1) ?: -1)
        }
    }

    for ((_, v) in hashMap) {
        if (v.second == 1) {
            return v.first
        }
    }

    return -1
}