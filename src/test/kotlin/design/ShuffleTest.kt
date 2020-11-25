package design

import org.junit.Assert
import org.junit.Test

class ShuffleTest {
    @Test
    fun should_have_shuffled_the_array() {
        val input = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val shuffle = Shuffle(input.copyOf())

        val result = shuffle.shuffle()

        Assert.assertFalse(input.contentEquals(result))
    }
}