package math

fun isPowerOfThree(n: Int): Boolean {
    var i = 0.toDouble()
    val nDouble = n.toDouble()
    do {
        val result = Math.pow(3.toDouble(), i++)
        if (result == nDouble) {
            return true
        }
    } while (result.toInt() < n)

    return false
}