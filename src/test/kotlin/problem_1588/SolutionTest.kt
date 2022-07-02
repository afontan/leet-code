package problem_1588

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.sumOddLengthSubarrays(intArrayOf(1,4,2,5,3))
        assertThat(case1).isEqualTo(58)

        val case2 = Solution.sumOddLengthSubarrays(intArrayOf(1,2))
        assertThat(case2).isEqualTo(3)

        val case3 = Solution.sumOddLengthSubarrays(intArrayOf(10,11,12))
        assertThat(case3).isEqualTo(66)
    }
}