package arrays


fun intersect(input1: IntArray, input2: IntArray): IntArray {
    val map1 = hashMapOf<Int, Int>()
    val map2 = hashMapOf<Int, Int>()
    val result = arrayListOf<Int>()

    for (i in input1.indices) {
        if (map1[input1[i]] != null) {
            map1[input1[i]] = map1[input1[i]]?.plus(1) ?: 0
        } else {
            map1[input1[i]] = 1
        }
    }

    for (i in input2.indices) {
        if (map2[input2[i]] != null) {
            map2[input2[i]] = map2[input2[i]]?.plus(1) ?: 0
        } else {
            map2[input2[i]] = 1
        }
    }

    for ((k, v) in map1) {
        if (map2.containsKey(k)) {
            val freq2 = map2[k] ?: 0
            val min = if (v < freq2) v else freq2

            for (i in 0 until min) {
                result.add(k)
            }
        }
    }
    return result.toIntArray()
}