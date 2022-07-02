package problem_1790

import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun `Description test cases`() {
    val case1 = Solution.areAlmostEqual("bank", "kanb")
    assert(case1)

    val case2 = Solution.areAlmostEqual("attack", "deffend")
    assert(!case2)

    val case3 = Solution.areAlmostEqual("kelb",   "kelb")
    assert(case3)
  }
}
