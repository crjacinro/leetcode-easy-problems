package arrays

import org.junit.Test

class RotateImageTest {
    @Test
    fun should_rotate_image_1() {
        val row0 = intArrayOf(1, 2, 3)
        val row1 = intArrayOf(4, 5, 6)
        val row2 = intArrayOf(7, 8, 9)

        val expected0 = intArrayOf(7, 4, 1)
        val expected1 = intArrayOf(8, 5, 9)
        val expected2 = intArrayOf(9, 6, 3)

        val image = arrayOf(row0, row1, row2)
        val expectedImage = arrayOf(expected0, expected1, expected2)

        val result = rotateImage(image)

        result.contentDeepEquals(expectedImage)
    }

    @Test
    fun should_rotate_image_2() {
        val row0 = intArrayOf(5, 1, 9, 11)
        val row1 = intArrayOf(2, 4, 8, 10)
        val row2 = intArrayOf(13, 3, 6, 7)
        val row3 = intArrayOf(15, 14, 12, 16)

        val expected0 = intArrayOf(15, 13, 2, 5)
        val expected1 = intArrayOf(14, 3, 4, 1)
        val expected2 = intArrayOf(12, 6, 8, 9)
        val expected3 = intArrayOf(16, 7, 10, 11)

        val image = arrayOf(row0, row1, row2, row3)
        val expectedImage = arrayOf(expected0, expected1, expected2, expected3)

        val result = rotateImage(image)

        result.contentDeepEquals(expectedImage)
    }
}