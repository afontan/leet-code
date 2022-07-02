package problem_1822

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.arraySign(intArrayOf(-1,-2,-3,-4,3,2,1))
        assertThat(case1).isEqualTo(1)

        val case2 = Solution.arraySign(intArrayOf(1,5,0,2,-3))
        assertThat(case2).isEqualTo(0)

        val case3 = Solution.arraySign(intArrayOf(-1,1,-1,1,-1))
        assertThat(case3).isEqualTo(-1)
    }
}