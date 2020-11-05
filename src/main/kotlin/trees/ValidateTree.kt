package trees

fun isValidBST(root: TreeNode?): Boolean {
    if (root == null) return true

    return isValid(root)
}

fun isValid(root: TreeNode?, left: TreeNode? = null, right: TreeNode? = null): Boolean {
    if (root == null) return true

    if (left != null && root.`val` <= left.`val`) return false
    if (right != null && root.`val` >= right.`val`) return false

    return isValid(root.left, left, root) && isValid(root.right, root, right)
}