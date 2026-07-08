class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // Step 1: Create a dummy head to simplify building the result list.
        val dummyHead = ListNode(0)
        var current = dummyHead
        var p = l1
        var q = l2
        var carry = 0

        // Step 2: Process both linked lists from the least significant digit to the most significant digit.
        while (p != null || q != null || carry != 0) {
            val sum = (p?.`val` ?: 0) + (q?.`val` ?: 0) + carry
            carry = sum / 10

            // Step 3: Append the current digit to the result list.
            current.next = ListNode(sum % 10)
            current = current.next!!

            // Step 4: Move to the next nodes in both input lists.
            p = p?.next
            q = q?.next
        }

        // Step 5: Return the linked list after the dummy head.
        return dummyHead.next
    }
}
