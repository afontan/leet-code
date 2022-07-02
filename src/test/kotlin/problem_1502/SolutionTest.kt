package problem_1502

import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.canMakeArithmeticProgression(intArrayOf(3, 5, 1))
        assert(case1)

        val case2 = Solution.canMakeArithmeticProgression(intArrayOf(1, 2, 4))
        assert(!case2)
    }
}