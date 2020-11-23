package design

class Shuffle(nums: IntArray) {
    private val original = nums.asList()

    /** Resets the array to its original configuration and return it. */
    fun reset(): IntArray {
        return original.toIntArray()
    }

    /** Returns a random shuffling of the array. */
    fun shuffle(): IntArray {
        return original.shuffled().toIntArray()
    }

//    /** Returns a random shuffling of the array. */
//    fun shuffleSlow(): IntArray {
//        newIndexMap.clear()
//        updateShuffleMap()
//
//        for (i in nums.indices) {
//            nums[i] = newIndexMap[i]!!
//        }
//
//        return nums
//    }
//
//    private fun updateShuffleMap() {
//        for (i in nums.indices) {
//            var random = 0
//            do {
//                random = (nums.indices).random()
//            } while (newIndexMap.containsKey(random))
//
//            newIndexMap[random] = nums[i]
//        }
//    }
}