package problem_1790

import org.assertj.core.api.Assertions.assertThat


import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun `Description test cases`() {
    val case1 = Solution.areAlmostEqual("bank", "kanb")
    assertThat(case1).isTrue

    val case2 = Solution.areAlmostEqual("attack", "deffend")
    assertThat(case2).isFalse

    val case3 = Solution.areAlmostEqual("kelb",   "kelb")
    assertThat(case3).isTrue

    val case4 = Solution.areAlmostEqual("aabbc", "ababd")
    assertThat(case4).isFalse
  }
}
