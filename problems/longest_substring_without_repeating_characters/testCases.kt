fun main() {
    val solution = Solution()

    val testCases = listOf(
        "abcabcbb" to 3,
        "bbbbb" to 1,
        "pwwkew" to 3,
        "" to 0,
        "dvdf" to 3,
        "abba" to 2,
        "tmmzuxt" to 5
    )

    for ((input, expected) in testCases) {
        val result = solution.lengthOfLongestSubstring(input)
        require(result == expected) {
            "Test failed for s=$input. Expected $expected, but got $result"
        }
    }

    println("All tests passed.")
}
