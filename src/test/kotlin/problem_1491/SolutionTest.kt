package problem_1491

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.average(intArrayOf(4000,3000,1000,2000))
        assertThat(case1).isEqualTo(2500.0)

        val case2 = Solution.average(intArrayOf(1000,2000,3000))
        assertThat(case2).isEqualTo(2000.0)
    }
}