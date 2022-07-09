package problem_36

object Solution {
    private val SQUARE_BORDERS = mapOf<Int, Pair<Int, Int>>(
        0 to Pair(0, 3),
        1 to Pair(0, 3),
        2 to Pair(0, 3),
        3 to Pair(3, 6),
        4 to Pair(3, 6),
        5 to Pair(3, 6),
        6 to Pair(6, 9),
        7 to Pair(6, 9),
        8 to Pair(6, 9)
    )

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val height = 9
        val width = 9
        val rows = Array(height) { HashMap<Char, Boolean>() }
        val cols = Array(width) { HashMap<Char, Boolean>() }
        for (i in 0 until height) {
            for (j in 0 until width) {
                if (board[i][j] != '.') {
                    if (rows[i].containsKey(board[i][j]) || cols[j].containsKey(board[i][j]) || !isValidSquare(board, i, j)) {
                        return false
                    } else {
                        rows[i][board[i][j]] = true
                        cols[j][board[i][j]] = true
                    }
                }
            }
        }
        return true
    }

    private fun isValidSquare(board: Array<CharArray>, xPosition: Int, yPosition: Int): Boolean {
        val (xLow, xHigh) = SQUARE_BORDERS[xPosition]!!
        val (yLow, yHigh) = SQUARE_BORDERS[yPosition]!!
        val elem = board[xPosition][yPosition]
        for (i in xLow until xHigh) {
            for (j in yLow until yHigh) {
                if (board[i][j] == elem && i != xPosition && j != yPosition) {
                    return false
                }
            }
        }
        return true
    }
}