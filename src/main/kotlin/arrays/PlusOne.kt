package arrays

fun plusOne(digits: IntArray): IntArray {
    val list: MutableList<Int> = digits.toMutableList()

    for (i in list.size - 1 downTo 0) {
        val plusOne = list[i] + 1

        if (plusOne > 9) {
            list[i] = 0
            if (i == 0) list.add(0, 1)
            continue
        } else {
            list[i] = plusOne
            break
        }
    }

    return list.toIntArray()
}
