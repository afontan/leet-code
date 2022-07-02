package problem_1779

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test case 1`() {
        val case1 = arrayOf(
            intArrayOf(1,2),
            intArrayOf(3,1),
            intArrayOf(2,4),
            intArrayOf(2,3),
            intArrayOf(4,4)
        )

        assertThat(Solution.nearestValidPoint(3, 4, case1)).isEqualTo(2)
    }

    @Test
    fun `Description test case 2`() {
        val case2 = arrayOf(
            intArrayOf(3,4)
        )

        assertThat(Solution.nearestValidPoint(3, 4, case2)).isEqualTo(0)
    }

    @Test
    fun `Description test case 3`() {
        val case3 = arrayOf(
            intArrayOf(2,3)
        )

        assertThat(Solution.nearestValidPoint(3, 4, case3)).isEqualTo(-1)
    }
}