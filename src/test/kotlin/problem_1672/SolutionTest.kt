package problem_1672

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `Description case 1`() {
        val customer1 = intArrayOf(1, 2, 3)
        val customer2 = intArrayOf(3, 2, 1)
        val case1 = Solution.maximumWealth(arrayOf(customer1, customer2))
        assertThat(case1).isEqualTo(6)
    }

    @Test
    fun `Description case 2`() {
        val customer1 = intArrayOf(1, 5)
        val customer2 = intArrayOf(7, 3)
        val customer3 = intArrayOf(3, 5)
        val case2 = Solution.maximumWealth(arrayOf(customer1, customer2, customer3))
        assertThat(case2).isEqualTo(10)
    }

    @Test
    fun `Description case 3`() {
        val customer1 = intArrayOf(2, 8, 7)
        val customer2 = intArrayOf(7, 1, 3)
        val customer3 = intArrayOf(1, 9, 5)
        val case1 = Solution.maximumWealth(arrayOf(customer1, customer2, customer3))
        assertThat(case1).isEqualTo(17)
    }
}