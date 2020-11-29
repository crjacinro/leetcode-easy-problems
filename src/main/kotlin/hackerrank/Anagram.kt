package hackerrank

fun stringAnagram(dictionary: Array<String>, query: Array<String>): Array<Int> {
    val result = Array(query.size) { 0 }
    var i = 0
    for (q in query) {
        for (d in dictionary) {
            if (isAnagram(q, d)) result[i]++
        }
        i++
    }

    return result
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val count = Array(26) { 0 }

    for (i in s.indices) {
        val first = s[i] - 'a'
        val second = t[i] - 'a'

        count[first]++
        count[second]--
    }

    for (i in count) {
        if (i != 0) return false
    }

    return true
}