package strings

fun findFirstUniqueChar(input: String): Int {
    val hashMap = hashMapOf<Char, Int>()

    for (i in input.indices) {
        val letter = input[i]

        if (!hashMap.containsKey(letter)) {
            hashMap[letter] = 1
        } else {
            val freq = hashMap[letter]
            hashMap[letter] = freq?.plus(1) ?: -1
        }
    }

    for (i in input.indices) {
        if (hashMap[input[i]]!! == 1) {
            return i
        }
    }

    return -1
}