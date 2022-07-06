package problem_1768

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun test1() {
        val case1 = Solution.mergeAlternately("abc", "pqr")
        assertThat(case1).isEqualTo("apbqcr")

        val case2 = Solution.mergeAlternately("ab", "pqrs")
        assertThat(case2).isEqualTo("apbqrs")

        val case3 = Solution.mergeAlternately("abcd", "pq")
        assertThat(case3).isEqualTo("apbqcd")
    }
}
