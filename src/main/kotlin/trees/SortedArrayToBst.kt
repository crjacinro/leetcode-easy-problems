package trees

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) return null
    if (nums.size == 1) return TreeNode(nums[0])

    val midIndex = nums.size / 2
    val rootValue = nums[midIndex]
    val leftArray = nums.slice(0 until midIndex).toIntArray()
    val rightArray = nums.slice(midIndex + 1 until nums.size).toIntArray()

    val leftSubtree = sortedArrayToBST(leftArray)
    val rightSubtree = sortedArrayToBST(rightArray)

    val root = TreeNode(rootValue)
    root.left = leftSubtree
    root.right = rightSubtree

    return root
}