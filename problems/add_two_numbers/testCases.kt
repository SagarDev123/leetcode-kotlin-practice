fun main() {
    val solution = Solution()

    fun buildList(vararg values: Int): ListNode? {
        val dummy = ListNode(0)
        var current = dummy
        for (value in values) {
            current.next = ListNode(value)
            current = current.next!!
        }
        return dummy.next
    }

    fun toList(head: ListNode?): List<Int> {
        val values = mutableListOf<Int>()
        var current = head
        while (current != null) {
            values.add(current.`val`)
            current = current.next
        }
        return values
    }

    val testCases = listOf(
        Pair(buildList(2, 4, 3), buildList(5, 6, 4)) to listOf(7, 0, 8),
        Pair(buildList(0), buildList(0)) to listOf(0),
        Pair(buildList(9, 9, 9, 9, 9, 9, 9), buildList(9, 9, 9, 9)) to listOf(8, 9, 9, 9, 0, 0, 0, 1)
    )

    for ((input, expected) in testCases) {
        val result = solution.addTwoNumbers(input.first, input.second)
        require(toList(result) == expected) {
            "Test failed for l1=${toList(input.first)}, l2=${toList(input.second)}. " +
                "Expected $expected, but got ${toList(result)}"
        }
    }

    println("All tests passed.")
}
