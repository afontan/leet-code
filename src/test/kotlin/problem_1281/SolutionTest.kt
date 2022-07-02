package problem_1281

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.subtractProductAndSum(234)
        assertThat(case1).isEqualTo(15)

        val case2 = Solution.subtractProductAndSum(4421)
        assertThat(case2).isEqualTo(21)
    }
}