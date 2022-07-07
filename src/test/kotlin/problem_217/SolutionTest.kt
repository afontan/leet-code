package problem_217

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        assertThat(Solution.containsDuplicate(intArrayOf(1, 2, 3, 1))).isTrue()
        assertThat(Solution.containsDuplicate(intArrayOf(1, 2, 3, 4))).isFalse()
        assertThat(Solution.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))).isTrue()
    }
}