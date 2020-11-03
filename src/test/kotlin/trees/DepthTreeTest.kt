package trees

import org.junit.Assert
import org.junit.Test

class DepthTreeTest {
    @Test
    fun should_return_depth() {
        val node3 = TreeNode(3)
        val node9 = TreeNode(9)
        val node20 = TreeNode(20)
        val node15 = TreeNode(15)
        val node7 = TreeNode(7)

        node3.left = node9
        node3.right = node20
        node20.left = node15
        node20.right = node7


        val result = maxDepth(node3)

        Assert.assertEquals(3, result)
    }

    @Test
    fun should_return_depth_simple() {
        val node3 = TreeNode(3)
        val node9 = TreeNode(9)
        val node20 = TreeNode(20)

        node3.left = node9
        node3.right = node20

        val result = maxDepth(node3)

        Assert.assertEquals(2, result)
    }
}