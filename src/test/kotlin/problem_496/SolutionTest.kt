package problem_496

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.nextGreaterElement(intArrayOf(4,1,2), intArrayOf(1,3,4,2))
        assertThat(case1).isEqualTo(intArrayOf(-1,3,-1))

        val case2 = Solution.nextGreaterElement(intArrayOf(2,4), intArrayOf(1,2,3,4))
        assertThat(case2).isEqualTo(intArrayOf(3, -1))
    }
}