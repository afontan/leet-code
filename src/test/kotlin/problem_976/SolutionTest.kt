package problem_976

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.largestPerimeter(intArrayOf(2,1,2))
        assertThat(case1).isEqualTo(5)

        val case2 = Solution.largestPerimeter(intArrayOf(1,2,1))
        assertThat(case2).isEqualTo(0)
    }
}