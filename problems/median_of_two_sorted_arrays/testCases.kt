fun main() {
    val solution = Solution()

    val testCases = listOf(
        Pair(intArrayOf(1, 3), intArrayOf(2)) to 2.0,
        Pair(intArrayOf(1, 2), intArrayOf(3, 4)) to 2.5,
        Pair(intArrayOf(0, 0), intArrayOf(0, 0)) to 0.0,
        Pair(intArrayOf(1), intArrayOf()) to 1.0,
        Pair(intArrayOf(), intArrayOf(2, 3)) to 2.5,
        Pair(intArrayOf(2), intArrayOf(1, 3, 4)) to 2.5
    )

    for ((input, expected) in testCases) {
        val result = solution.findMedianSortedArrays(input.first, input.second)
        require(result == expected) {
            "Test failed for nums1=${input.first.contentToString()}, nums2=${input.second.contentToString()}. " +
                "Expected $expected, but got $result"
        }
    }

    println("All tests passed.")
}
