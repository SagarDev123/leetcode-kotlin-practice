class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        // Step 1: Ensure nums1 is the smaller array to reduce the search space.
        if (nums1.size > nums2.size) {
            return findMedianSortedArrays(nums2, nums1)
        }

        val m = nums1.size
        val n = nums2.size
        var low = 0
        var high = m

        // Step 2: Binary search on the partition point in nums1.
        while (low <= high) {
            val partition1 = (low + high) / 2
            val partition2 = (m + n + 1) / 2 - partition1

            val maxLeft1 = if (partition1 == 0) Int.MIN_VALUE else nums1[partition1 - 1]
            val minRight1 = if (partition1 == m) Int.MAX_VALUE else nums1[partition1]
            val maxLeft2 = if (partition2 == 0) Int.MIN_VALUE else nums2[partition2 - 1]
            val minRight2 = if (partition2 == n) Int.MAX_VALUE else nums2[partition2]

            // Step 3: Check whether the partition is correct.
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // Step 4: Compute the median based on whether total length is even or odd.
                val leftMax = maxOf(maxLeft1, maxLeft2)
                val rightMin = minOf(minRight1, minRight2)

                return if ((m + n) % 2 == 0) {
                    (leftMax + rightMin) / 2.0
                } else {
                    leftMax.toDouble()
                }
            } else if (maxLeft1 > minRight2) {
                high = partition1 - 1
            } else {
                low = partition1 + 1
            }
        }

        throw IllegalArgumentException("Input arrays are not sorted")
    }
}
