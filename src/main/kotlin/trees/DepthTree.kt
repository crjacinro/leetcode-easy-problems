package trees

fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0

    val leftHeight = maxDepth(root.left)
    val rightHeight = maxDepth(root.right)

    return 1 + if (leftHeight > rightHeight) leftHeight else rightHeight
}