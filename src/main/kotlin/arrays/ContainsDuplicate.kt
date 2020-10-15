package arrays

fun containsDuplicate(input: IntArray): Boolean {
    val map = hashMapOf<Int, Int>()

    for (i in input.indices) {
        if (map.containsKey(input[i])) {
            return true
        } else {
            map[input[i]] = input[i]
        }
    }

    return false
}