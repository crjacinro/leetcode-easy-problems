package others

fun hammingWeight(n: Int): Int {
    val str = Integer.toBinaryString(n)
    var count = 0

    for (i in str.indices) {
        if (str[i] == '1')
            count++
    }
    return count
}

fun hammingWeight_masking(n: Int): Int {
    var bits = 0
    var mask = 1
    for (i in 0..31) {
        if (n and mask != 0) {
            bits++
        }
        mask = mask shl 1
    }
    return bits
}

fun hammingWeight_bit_manipulation(n: Int): Int {
    var n = n
    var sum = 0
    while (n != 0) {
        sum++
        n = n and n - 1
    }
    return sum
}