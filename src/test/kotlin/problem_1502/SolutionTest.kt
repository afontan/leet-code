package problem_1502

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.canMakeArithmeticProgression(intArrayOf(3, 5, 1))
        assertThat(case1).isTrue

        val case2 = Solution.canMakeArithmeticProgression(intArrayOf(1, 2, 4))
        assertThat(case2).isFalse
    }
}