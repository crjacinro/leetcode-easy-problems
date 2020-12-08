package others

fun generate(numRows: Int): List<List<Int>> {
    if (numRows == 0) return listOf()
    if (numRows == 1) return listOf(listOf(1))

    val previousRows = generate(numRows - 1).toMutableList()
    val lastRow = previousRows.last()
    val currentRow = mutableListOf<Int>()

    currentRow.add(1)

    for (i in 1 until lastRow.size) {
        val prevNum = lastRow[i - 1]
        val curNum = lastRow[i]

        currentRow.add(prevNum + curNum)
    }

    currentRow.add(1)

    previousRows.add(currentRow)

    return previousRows
}