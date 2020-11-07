package trees

import org.junit.Test

class LevelOrderTest {
    @Test
    fun should_print_simple_tree() {
        val node1 = TreeNode(1)
        val node2 = TreeNode(2)
        val node3 = TreeNode(3)

        node2.left = node1
        node2.right = node3

        val result = levelOrder(node2)

        print(result)
    }
}