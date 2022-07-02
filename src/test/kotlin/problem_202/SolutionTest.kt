package problem_202

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.isHappy(19)
        assertThat(case1).isTrue

        val case2 = Solution.isHappy(2)
        assertThat(case2).isFalse
    }
}