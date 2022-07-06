package problem_1309

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.freqAlphabets("10#11#12")
        assertThat(case1).isEqualTo("jkab")

        val case2 = Solution.freqAlphabets("1326#")
        assertThat(case2).isEqualTo("acz")
    }
}