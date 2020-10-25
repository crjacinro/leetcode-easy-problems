package strings

fun isPalindrome(input: String): Boolean {
    val filteredString = StringBuilder()
    for (i in input.indices) {
        if (input[i].isLetterOrDigit()) {
            filteredString.append(input[i])
        }
    }

    val reversedString = StringBuilder()
    for (i in filteredString.indices.reversed()) {
        reversedString.append(filteredString[i])
    }

    return filteredString.toString().equals(reversedString.toString(), true)
}