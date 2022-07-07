package problem_242

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        assertThat(Solution.isAnagram("anagram", "nagaram")).isTrue
        assertThat(Solution.isAnagram("rat", "car")).isFalse
    }
}