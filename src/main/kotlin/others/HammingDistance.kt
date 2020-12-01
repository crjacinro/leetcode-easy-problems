package others

fun hammingDistance(x: Int, y: Int): Int {
    val result = x.xor(y)
    var bits = 0
    var mask = 1
    for (i in 0..31) {
        if (result and mask != 0) {
            bits++
        }
        mask = mask shl 1
    }
    return bits

}