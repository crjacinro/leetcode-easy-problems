package trees

fun levelOrder(root: TreeNode?): List<List<Int>> {
    val height = height(root)
    val allLevels = mutableListOf<List<Int>>()

    for (i in 1 until height + 1) {
        val level = getLevelNodes(root, i)
        allLevels.add(level)
    }

    return allLevels
}

fun getLevelNodes(root: TreeNode?, level: Int): List<Int> {
    val levelList = mutableListOf<Int>()
    val leftList = mutableListOf<Int>()
    val rightList = mutableListOf<Int>()

    if (root == null) return listOf()
    if (level == 1) return listOf(root.`val`)

    if (level > 1) {
        leftList.addAll(getLevelNodes(root.left, level - 1))
        rightList.addAll(getLevelNodes(root.right, level - 1))
    }

    levelList.addAll(leftList)
    levelList.addAll(rightList)

    return levelList
}

fun height(root: TreeNode?): Int {
    if (root == null) return 0

    val leftHeight = height(root.left)
    val rightHeight = height(root.right)

    return 1 + if (leftHeight > rightHeight) leftHeight else rightHeight
}