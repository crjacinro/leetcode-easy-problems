package arrays

fun validSudoku(sudoku: Array<CharArray>): Boolean {
    for (i in sudoku.indices) {
        if (!isRowValid(sudoku[i])) {
            return false
        }
    }

    for (i in sudoku.indices) {
        if (!isColumnValid(i, sudoku)) {
            return false
        }
    }

    for (i in 0 until 3) {
        for (j in 0 until 3) {
            val row0 = charArrayOf(sudoku[3 * i + 0][3 * j], sudoku[3 * i + 0][3 * j + 1], sudoku[3 * i + 0][3 * j + 2])
            val row1 = charArrayOf(sudoku[3 * i + 1][3 * j], sudoku[3 * i + 1][3 * j + 1], sudoku[3 * i + 1][3 * j + 2])
            val row2 = charArrayOf(sudoku[3 * i + 2][3 * j], sudoku[3 * i + 2][3 * j + 1], sudoku[3 * i + 2][3 * j + 2])

            val square = arrayOf(row0, row1, row2)

            if (!is3x3SquareValid(square)) {
                return false
            }
        }
    }

    return true
}

fun isRowValid(row: CharArray): Boolean {
    val rowMap = hashMapOf<Char, Char>()
    for (i in row.indices) {
        val element = row[i]
        val elementInt = element.toInt()
        if (rowMap.containsKey(element)) {
            return false
        } else if (elementInt in 48..58) {
            rowMap[element] = element
        }
    }
    return true
}

fun isColumnValid(column: Int, sudoku: Array<CharArray>): Boolean {
    val rowMap = hashMapOf<Char, Char>()
    for (i in sudoku.indices) {
        val element = sudoku[i][column]
        val elementInt = element.toInt()
        if (rowMap.containsKey(element)) {
            return false
        } else if (elementInt in 48..58) {
            rowMap[element] = element
        }
    }
    return true
}

fun is3x3SquareValid(square: Array<CharArray>): Boolean {
    val rowMap = hashMapOf<Char, Char>()

    for (i in square.indices) {
        for (j in square.indices) {
            val element = square[i][j]
            val elementInt = element.toInt()
            if (rowMap.containsKey(element)) {
                return false
            } else if (elementInt in 48..58) {
                rowMap[element] = element
            }
        }
    }
    return true
}