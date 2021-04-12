package trees

fun isValidBST(root: TreeNode?): Boolean {
    if (root == null) return true

    return isValid(root)
}

fun isValid(root: TreeNode?, minimumNode: Int? = null, maximumNode: Int? = null): Boolean {
    if (root == null) return true

    if (minimumNode != null && root.`val` <= minimumNode) return false
    if (maximumNode != null && root.`val` >= maximumNode) return false

    return isValid(root.left, minimumNode, root.`val`) && isValid(root.right, root.`val`, maximumNode)
}