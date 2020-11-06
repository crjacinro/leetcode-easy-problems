package trees

// Solution is to get a string representation of each subtrees.
// Left subtree should use a pre-order traversal with LEFT child first
// Right subtree should use a pre-order traversal with RIGHT child first
fun isSymmetric(root: TreeNode?): Boolean {
    val leftValue = treeToStringPreOrder(root?.left, true)
    val rightValue = treeToStringPreOrder(root?.right, false)

    return leftValue == rightValue
}

fun treeToStringPreOrder(root: TreeNode?, isLeftFirst: Boolean): String {
    // Use a temporary string to distinguish the next node after a leaf
    if (root == null) return "-"

    val result = StringBuilder()

    // append the root value first
    result.append(root.`val`)

    // check if we are traversing left child first or right child
    val firstChild = if (isLeftFirst) root.left else root.right
    val secondChild = if (isLeftFirst) root.right else root.left

    // get string representation of children, depending on the order
    val firstChildResult = treeToStringPreOrder(firstChild, isLeftFirst)
    val secondChildResult = treeToStringPreOrder(secondChild, isLeftFirst)

    // append both results
    result.append(firstChildResult)
    result.append(secondChildResult)

    return result.toString()
}