package problem_283

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = intArrayOf(0, 1, 0, 3, 12)
        Solution.moveZeroes(case1)
        assertThat(case1).isEqualTo(intArrayOf(1, 3, 12, 0, 0))

        val case2 = intArrayOf(0)
        Solution.moveZeroes(case2)
        assertThat(case2).isEqualTo(intArrayOf(0))
    }
}