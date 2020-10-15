package arrays

fun singleNumber(input: IntArray): Int {
    val map = hashMapOf<Int, Int?>()

    for (i in input.indices) {
        val num = input[i]
        if (map.containsKey(num)) {
            map.remove(num)
        } else {
            map[num] = i
        }
    }

    return map.entries.first().key
}