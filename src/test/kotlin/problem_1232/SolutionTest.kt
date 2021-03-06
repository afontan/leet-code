package problem_1232

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases 1`() {
        val case1 = arrayOf(
            intArrayOf(1,2),
            intArrayOf(2,3),
            intArrayOf(3,4),
            intArrayOf(4,5),
            intArrayOf(5,6),
            intArrayOf(6,7)
        )

        assertThat(Solution.checkStraightLine(case1)).isTrue
    }

    @Test
    fun `Description test case 2`() {
        val case2 = arrayOf(
            intArrayOf(1,1),
            intArrayOf(2,2),
            intArrayOf(3,4),
            intArrayOf(4,5),
            intArrayOf(5,6),
            intArrayOf(7,7)
        )

        assertThat(Solution.checkStraightLine(case2)).isFalse
    }

    @Test
    fun `Edge case`() {
        val edgeCase = arrayOf(
            intArrayOf(0,0),
            intArrayOf(0,5),
            intArrayOf(5,5),
            intArrayOf(5,0),
        )

        assertThat(Solution.checkStraightLine(edgeCase)).isFalse
    }
}