package problem_202

import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun test() {
        val case1 = Solution.isHappy(19)
        assert(case1)

        val case2 = Solution.isHappy(2)
        assert(!case2)
    }
}