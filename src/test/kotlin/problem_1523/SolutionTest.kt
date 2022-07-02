package problem_1523

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test case`() {
        val case1 = Solution.countOdds(3, 7)
        assertThat(case1).isEqualTo(3)

        val case2 = Solution.countOdds(8, 10)
        assertThat(case2).isEqualTo(1)
    }

    @Test
    fun `Edge case`() {
        val edgeCase = Solution.countOdds(1, 10)
        assertThat(edgeCase).isEqualTo(5)
    }
}