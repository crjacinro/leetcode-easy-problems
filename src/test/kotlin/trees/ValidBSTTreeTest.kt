package trees

import org.junit.Assert
import org.junit.Test

class ValidBSTTreeTest {
    @Test
    fun should_return_true_basic() {
        val node1 = TreeNode(1)
        val node2 = TreeNode(2)
        val node3 = TreeNode(3)

        node2.left = node1
        node2.right = node3

        val result = isValidBST(node2)

        Assert.assertTrue(result)
    }

    @Test
    fun should_return_true_complex() {
        val node5 = TreeNode(5)
        val node1 = TreeNode(1)
        val node4 = TreeNode(4)
        val node3 = TreeNode(3)
        val node6 = TreeNode(6)

        node5.left = node1
        node5.right = node4
        node4.left = node3
        node4.right = node6

        val result = isValidBST(node5)

        Assert.assertFalse(result)
    }

    @Test
    fun should_return_true_deep() {
        val node5 = TreeNode(10)
        val node1 = TreeNode(5)
        val node4 = TreeNode(15)
        val node3 = TreeNode(6)
        val node6 = TreeNode(20)

        node5.left = node1
        node5.right = node4
        node4.left = node3
        node4.right = node6

        val result = isValidBST(node5)

        Assert.assertFalse(result)
    }

    @Test
    fun should_return_true_balanced() {
        val node5 = TreeNode(3)
        val node1 = TreeNode(1)
        val node4 = TreeNode(5)
        val node3 = TreeNode(4)
        val node6 = TreeNode(6)
        val node0 = TreeNode(0)
        val node2 = TreeNode(2)

        node5.left = node1
        node5.right = node4
        node4.left = node3
        node4.right = node6
        node1.left = node0
        node1.right = node2

        val result = isValidBST(node5)

        Assert.assertTrue(result)
    }
}