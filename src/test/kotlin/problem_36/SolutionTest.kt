package problem_36

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test case 1`() {
        val case1 = arrayOf(
            charArrayOf('5','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9')
        )

        assertThat(Solution.isValidSudoku(case1)).isTrue
    }

    @Test
    fun `Description test case 2`() {
        val case2 = arrayOf(
            charArrayOf('8','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9')
        )

        assertThat(Solution.isValidSudoku(case2)).isFalse
    }
    
    @Test
    fun `Edge case`() {
        val edgeCase = arrayOf(
            charArrayOf('.','.','.','.','5','.','.','1','.'),
            charArrayOf('.','4','.','3','.','.','.','.','.'),
            charArrayOf('.','.','.','.','.','3','.','.','1'),
            charArrayOf('8','.','.','.','.','.','.','2','.'),
            charArrayOf('.','.','2','.','7','.','.','.','.'),
            charArrayOf('.','1','5','.','.','.','.','.','.'),
            charArrayOf('.','.','.','.','.','2','.','.','.'),
            charArrayOf('.','2','.','9','.','.','.','.','.'),
            charArrayOf('.','.','4','.','.','.','.','.','.')
        )

        assertThat(Solution.isValidSudoku(edgeCase)).isFalse
    }
}