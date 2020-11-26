package math

fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()
    for (i in 1 until n + 1) {
        if (i % 5 == 0 && i % 3 == 0) result.add("FizzBuzz")
        else if (i % 3 == 0) result.add("Fizz")
        else if (i % 5 == 0) result.add("Buzz")
        else result.add(i.toString())
    }

    return result
}