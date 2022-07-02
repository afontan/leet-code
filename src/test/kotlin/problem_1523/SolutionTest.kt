package problem_1523

import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test case`() {
        val case1 = Solution.countOdds(3, 7)
        assert(case1 == 3)

        val case2 = Solution.countOdds(8, 10)
        assert(case2 == 1)
    }

    @Test
    fun `Edge case`() {
        val edgeCase = Solution.countOdds(1, 10)
        assert(edgeCase == 5)
    }
}