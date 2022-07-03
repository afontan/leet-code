package problem_1572

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test case 1`() {
        val row1 = intArrayOf(1, 2, 3)
        val row2 = intArrayOf(4, 5, 6)
        val row3 = intArrayOf(7, 8, 9)
        val case1 = Solution.diagonalSum(arrayOf(row1, row2, row3))

        assertThat(case1).isEqualTo(25)
    }

    @Test
    fun `Description test case 2`() {
        val row1 = intArrayOf(1, 1, 1)
        val row2 = intArrayOf(1, 1, 1)
        val row3 = intArrayOf(1, 1, 1)
        val case2 = Solution.diagonalSum(arrayOf(row1, row2, row3))

        assertThat(case2).isEqualTo(5)
    }

    @Test
    fun `Description test case 3`() {
        val row1 = intArrayOf(5)
        val case3 = Solution.diagonalSum(arrayOf(row1))

        assertThat(case3).isEqualTo(5)
    }
}