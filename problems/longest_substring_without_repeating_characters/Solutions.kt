class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        // Step 1: Keep track of the last seen index of each character.
        val lastSeen = HashMap<Char, Int>()
        var left = 0
        var best = 0

        // Step 2: Expand the window from left to right.
        for (right in s.indices) {
            val currentChar = s[right]

            // Step 3: If the character was seen inside the current window,
            // move the left pointer past the previous occurrence.
            if (lastSeen.containsKey(currentChar)) {
                left = maxOf(left, lastSeen[currentChar]!! + 1)
            }

            // Step 4: Update the last seen position and the best length.
            lastSeen[currentChar] = right
            best = maxOf(best, right - left + 1)
        }

        return best
    }
}
