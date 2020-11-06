package trees

import org.junit.Assert
import org.junit.Test

class SymmetricalTreeTest {
    @Test
    fun should_return_true() {
        val node1 = TreeNode(1)
        val node2_left = TreeNode(2)
        val node2_right = TreeNode(2)
        val node3_left = TreeNode(3)
        val node3_right = TreeNode(3)
        val node4_left = TreeNode(4)
        val node4_right = TreeNode(4)

        node1.left = node2_left
        node1.right = node2_right
        node2_left.left = node3_left
        node2_left.right = node4_left
        node2_right.left = node4_right
        node2_right.right = node3_right

        val result = isSymmetric(node1)

        Assert.assertTrue(result)
    }

    @Test
    fun should_return_false() {
        val node1 = TreeNode(1)
        val node2_left = TreeNode(2)
        val node2_right = TreeNode(2)
        val node3_left = TreeNode(3)
        val node3_right = TreeNode(3)


        node1.left = node2_left
        node1.right = node2_right
        node2_left.right = node3_left
        node2_right.right = node3_right

        val result = isSymmetric(node1)

        Assert.assertFalse(result)
    }
}