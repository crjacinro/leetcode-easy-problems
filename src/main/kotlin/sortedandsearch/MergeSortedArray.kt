package sortedandsearch

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    val result = mutableListOf<Int>()

    var num1Counter = 0
    var num2Counter = 0

    while (num1Counter < m || num2Counter < n) {
        var num1: Int? = null
        var num2: Int? = null

        if (num1Counter < m) num1 = nums1[num1Counter]
        if (num2Counter < n) num2 = nums2[num2Counter]

        if (num1 != null && num2 != null) {
            if (num1 <= num2) {
                result.add(num1)
                num1Counter++
            } else {
                result.add(num2)
                num2Counter++
            }
        } else if (num1 == null && num2 != null) {
            result.add(num2)
            num2Counter++
        } else if (num2 == null && num1 != null) {
            result.add(num1)
            num1Counter++
        }
    }

    result.toIntArray().copyInto(nums1)
}