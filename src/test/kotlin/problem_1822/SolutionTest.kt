package problem_1822

import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.arraySign(intArrayOf(-1,-2,-3,-4,3,2,1))
        assert(case1 == 1)

        val case2 = Solution.arraySign(intArrayOf(1,5,0,2,-3))
        assert(case2 == 0)

        val case3 = Solution.arraySign(intArrayOf(-1,1,-1,1,-1))
        assert(case3 == -1)
    }
}