package problem_1290

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test case 1`() {
        val root = ListNode(1).apply {
            next = ListNode(0).apply {
                next = ListNode(1)
            }
        }

        val solution = Solution.getDecimalValue(root)
        assertThat(solution).isEqualTo(5)
    }

    @Test
    fun `Description test case 2`() {
        val root = ListNode(0)

        val solution = Solution.getDecimalValue(root)
        assertThat(solution).isEqualTo(0)
    }
}