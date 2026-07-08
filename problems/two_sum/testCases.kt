import java.util.*

fun main() {
    val solution = Solution()

    // Sample test cases from the problem statement.
    val testCases = listOf(
        Pair(intArrayOf(2, 7, 11, 15), 9) to intArrayOf(0, 1),
        Pair(intArrayOf(3, 2, 4), 6) to intArrayOf(1, 2),
        Pair(intArrayOf(3, 3), 6) to intArrayOf(0, 1)
    )

    for ((input, expected) in testCases) {
        val result = solution.twoSum(input.first, input.second)
        require(result.contentEquals(expected)) {
            "Test failed for nums=${input.first.contentToString()}, target=${input.second}. " +
                "Expected ${expected.contentToString()}, but got ${result.contentToString()}"
        }
    }

    println("All tests passed.")
}
