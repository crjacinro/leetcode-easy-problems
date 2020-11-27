package math

fun countPrimes(n: Int): Int {
    if (n == 0 || n == 1) return 0

    var count = 0
    for (i in 1 until n) {
        if (isPrime(i)) count++

    }
    return count
}

private fun isPrime(n: Int): Boolean {
    if (n <= 1) return false

    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}