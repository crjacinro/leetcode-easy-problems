package arrays

import org.junit.Assert
import org.junit.Test

class ValidSudokuTest {
    @Test
    fun is_valid_sudoku_1() {
        val row0 = charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.')
        val row1 = charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.')
        val row2 = charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.')
        val row3 = charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3')
        val row4 = charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1')
        val row5 = charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6')
        val row6 = charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.')
        val row7 = charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5')
        val row8 = charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')

        val sudoku = arrayOf(row0, row1, row2, row3, row4, row5, row6, row7, row8)

        Assert.assertTrue(validSudoku(sudoku))
    }

    @Test
    fun is_valid_sudoku_2() {
        val row0 = charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.')
        val row1 = charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.')
        val row2 = charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.')
        val row3 = charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3')
        val row4 = charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1')
        val row5 = charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6')
        val row6 = charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.')
        val row7 = charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5')
        val row8 = charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')

        val sudoku = arrayOf(row0, row1, row2, row3, row4, row5, row6, row7, row8)

        Assert.assertFalse(validSudoku(sudoku))
    }

    @Test
    fun is_valid_sudoku_3() {
        val row0 = charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '4')
        val row1 = charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.')
        val row2 = charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.')
        val row3 = charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3')
        val row4 = charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1')
        val row5 = charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6')
        val row6 = charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.')
        val row7 = charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5')
        val row8 = charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')

        val sudoku = arrayOf(row0, row1, row2, row3, row4, row5, row6, row7, row8)

        Assert.assertTrue(validSudoku(sudoku))
    }

    @Test
    fun is_valid_sudoku_4() {
        val row0 = charArrayOf('5', '3', '.', '.', '7', '.', '6', '.', '4')
        val row1 = charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.')
        val row2 = charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.')
        val row3 = charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3')
        val row4 = charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1')
        val row5 = charArrayOf('7', '.', '.', '.', '2', '8', '.', '.', '6')
        val row6 = charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.')
        val row7 = charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5')
        val row8 = charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')

        val sudoku = arrayOf(row0, row1, row2, row3, row4, row5, row6, row7, row8)

        Assert.assertFalse(validSudoku(sudoku))
    }

}