package problem_191

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.hammingWeight(521)
        assertThat(case1).isEqualTo(3)

        val case2 = Solution.hammingWeight(2097152)
        assertThat(case2).isEqualTo(1)

        val case3 = Solution.hammingWeight(-3)
        assertThat(case3).isEqualTo(31)
    }
}