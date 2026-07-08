class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Step 1: Create a hash map to store each number and its index.
        // This lets us check if the complement has already been seen in O(1) time.
        val seen = HashMap<Int, Int>()

        // Step 2: Loop through the array once.
        for (index in nums.indices) {
            val currentValue = nums[index]
            val complement = target - currentValue

            // Step 3: If the complement already exists in the map,
            // we found the matching pair.
            if (seen.containsKey(complement)) {
                return intArrayOf(seen[complement]!!, index)
            }

            // Step 4: If not, store the current number and its index for later.
            seen[currentValue] = index
        }

        // Step 5: The problem guarantees one valid solution,
        // but returning an empty array keeps the method safe.
        return intArrayOf()
    }
}

