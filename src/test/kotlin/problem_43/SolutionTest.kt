package problem_43

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test case`() {
        val case1 = Solution.multiply("2", "3")
        assertThat(case1).isEqualTo("6")

        val case2 = Solution.multiply("123", "456")
        assertThat(case2).isEqualTo("56088")
    }
}