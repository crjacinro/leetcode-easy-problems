package others

import org.junit.Assert
import org.junit.Test


class ReverseBitsTest {
    @Test
    fun should_reverse_bits() {
        val x = "00000010100101000001111010011100".toInt(2)
        val expected = 964176192
        val result = reverseBits(x)

        Assert.assertEquals(expected, result)
    }

    @Test
    fun should_reverse_bits_negative() {
        val x = -3
        val expected = -1073741825
        val result = reverseBits(x)

        Assert.assertEquals(expected, result)
    }
}