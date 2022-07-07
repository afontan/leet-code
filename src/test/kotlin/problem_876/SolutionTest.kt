package problem_876

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description test case 1`() {
        val root = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }
        val case1 = Solution.middleNode(root)
        assertThat(case1!!.`val`).isEqualTo(3)
    }

    @Test
    fun `Description test case 2`() {
        val root = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5).apply {
                            next = ListNode(6)
                        }
                    }
                }
            }
        }
        val case1 = Solution.middleNode(root)
        assertThat(case1!!.`val`).isEqualTo(4)
    }
}