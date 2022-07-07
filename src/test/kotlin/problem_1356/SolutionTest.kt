package problem_1356

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test cases`() {
        val case1 = Solution.sortByBits(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8))
        assertThat(case1).isEqualTo(intArrayOf(0, 1, 2, 4, 8, 3, 5, 6, 7))

        val case2 = Solution.sortByBits(intArrayOf(1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1))
        assertThat(case2).isEqualTo(intArrayOf(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024))
    }
}