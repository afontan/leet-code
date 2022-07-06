package problem_953

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun `Description test cases`() {
    val case1 = Solution.isAlienSorted(arrayOf("hello", "leetcode"), "hlabcdefgijkmnopqrstuvwxyz")
    assertThat(case1).isTrue

    val case2 =
        Solution.isAlienSorted(arrayOf("word", "world", "row"), "worldabcefghijkmnpqstuvxyz")
    assertThat(case2).isFalse

    val case3 = Solution.isAlienSorted(arrayOf("apple", "app"), "abcdefghijklmnopqrstuvwxyz")
    assertThat(case3).isFalse
  }

  @Test
  fun `Edge case 1`() {
    val case1 = Solution.isAlienSorted(arrayOf("hello", "hello"), "abcdefghijklmnopqrstuvwxyz")
    assertThat(case1).isTrue
  }
}
