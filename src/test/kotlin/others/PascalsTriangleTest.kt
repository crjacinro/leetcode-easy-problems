package others

import org.junit.Assert
import org.junit.Test

class PascalsTriangleTest {
    @Test
    fun should_return_binary() {
        val input = 5
        val expected = listOf(
            listOf(1),
            listOf(1, 1),
            listOf(1, 2, 1),
            listOf(1, 3, 3, 1),
            listOf(1, 4, 6, 4, 1)
        )
        val result = generate(input)

        Assert.assertTrue(result == expected)
    }
}