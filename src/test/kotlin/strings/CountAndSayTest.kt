package strings

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CountAndSayTest {
    @Test
    fun should_count_and_say_base() {
        val input = 1
        val expected = "1"

        val result = countAndSay(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_count_and_say_4() {
        val input = 4
        val expected = "1211"

        val result = countAndSay(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_count_and_say_9() {
        val input = 9
        val expected = "31131211131221"

        val result = countAndSay(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_count_and_say_10() {
        val input = 10
        val expected = "13211311123113112211"

        val result = countAndSay(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_say_test() {
        val input = "11"
        val expected = "21"

        val result = say(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_say_test_1() {
        val input = "1"
        val expected = "11"

        val result = say(input)

        assertEquals(expected, result)
    }

    @Test
    fun should_say_test_group() {
        val input = "111223"
        val expected = "312213"

        val result = say(input)

        assertEquals(expected, result)
    }
}