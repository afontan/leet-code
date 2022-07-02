package problem_1281

import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.subtractProductAndSum(234)
        assert(case1 == 15)

        val case2 = Solution.subtractProductAndSum(4421)
        assert(case2 == 21)
    }
}