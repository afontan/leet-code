package problem_976

import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.largestPerimeter(intArrayOf(2,1,2))
        assert(case1 == 5)

        val case2 = Solution.largestPerimeter(intArrayOf(1,2,1))
        assert(case2 == 0)
    }
}