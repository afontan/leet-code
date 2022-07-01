package problem_191

import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun test() {
        val case1 = Solution.hammingWeight(521)
        assert(case1 == 3)

        val case2 = Solution.hammingWeight(2097152)
        assert(case2 == 1)

        val case3 = Solution.hammingWeight(-3)
        assert(case3 == 31)
    }
}