package arrays

fun twoSum(input: IntArray, target: Int): IntArray {
    val inputMap = hashMapOf<Int, Int>()

    for (i in input.indices) {
        inputMap[input[i]] = i
    }

    for (i in input.indices) {
        val diff = target - input[i]
        if (inputMap.containsKey(diff) && inputMap[diff] != i) {
            return intArrayOf(i, inputMap[diff]!!)
        }
    }
    return intArrayOf()
}